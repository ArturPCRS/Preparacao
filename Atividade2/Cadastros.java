package Atividade2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cadastros {
    
    List<Cliente> listaClientes = new ArrayList<>();
    Map<Pedido, Cliente> pedidosCliente = new HashMap<>();
    List<Produto> listaProdutos = new ArrayList<>();

    private static Cadastros instance;

    public static Cadastros getInstance(){
        if (instance == null){
            instance = new Cadastros();
        }
        return instance;
    }

    public void cadastraProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public void cadastraClientes(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void adicionaPedidos(Pedido pedido, Cliente cliente){
        pedidosCliente.put(pedido, cliente);

        for (Produto p : pedido.getProdutos()){
            p.setnoCarrinho(true);
        }
    }

    

}
