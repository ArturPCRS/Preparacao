package Atividade2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPedido {

    Map<Pedido, List<Produto>> itemPedido = new HashMap<>();
    Map<String, Pedido> pedidoClientes = new HashMap<>();
    
    Map<Map<Pedido, List<Produto>>, Cliente> clientes = new HashMap<>();

    List<Produto> listaProdutos = new ArrayList<>();

    private static ItemPedido instance;
    
    public static ItemPedido getInstance(){
        if (instance == null){
            instance = new ItemPedido();
        }
        return instance;
    }

    public void cadastraPedido(Pedido pedido, List<Produto> produtos){
        itemPedido.put(pedido, produtos);
        for (Produto p : produtos){
            p.setStatus(true);
        }
    }

    public void cadastraPedidoCliente(String CPF, Pedido pedido){
        pedidoClientes.put(CPF, pedido);
    }

    public void cadastraProduto(Produto produto){
        listaProdutos.add(produto);
    }
    
    public int quantidadeVendido(Produto produto){
        int quantidade = 0;
        for (Map.Entry<Pedido, List<Produto>> entry : itemPedido.entrySet()){
            List<Produto> produtosVendidos = entry.getValue();
            for (Produto p : produtosVendidos){
                if (p.getStatus() == true){
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public void cadastraClientes(Map<Pedido, List<Produto>> itemproduto, Cliente cliente){
        clientes.put(itemPedido, cliente);
    }
}

