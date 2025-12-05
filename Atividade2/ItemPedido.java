package Atividade2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPedido {
    //CodigoPedido // CodigoProduto
    //Map<String, String> itemPedido = new HashMap<>();
    Map<Pedido, Produto> itemPedido = new HashMap<>();
    List<Produto> listaProdutos = new ArrayList<>();

    private static ItemPedido instance;
    
    public static ItemPedido getInstance(){
        if (instance == null){
            instance = new ItemPedido();
        }
        return instance;
    }

    public void cadastraProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public void cadastraPedido(Pedido pedido, Produto produto){
        itemPedido.put(pedido, produto);
    }

    public Produto getProduto(String codigoProduto){
        for (Map.Entry<Pedido, Produto> entry : itemPedido.entrySet()){
            Produto produto = entry.getValue();
            if (produto.getCodigo().equals(codigoProduto)){
                return produto;
            }
        }
        return null;
    }

    public Pedido getPedido(String codigoPedido){
        for (Map.Entry<Pedido, Produto> entry : itemPedido.entrySet()){
            Pedido pedido = entry.getKey();
            if (pedido.getCodigoPedido().equals(codigoPedido)){
                return pedido;
            }
        }
        return null;
    }
}
