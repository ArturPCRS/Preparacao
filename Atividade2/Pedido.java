package Atividade2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    String codigoPedido;
    String CPFCliente;
    List<Produto> produtos = new ArrayList<>();

    public Pedido(String codigo, String CPF, List<Produto> produtos){
        this.codigoPedido = codigo;
        this.CPFCliente = CPF;
        this.produtos = produtos;
    }

    public String getCodigoPedido(){
        return this.codigoPedido;
    }

    public String getPedidoCliente(){
        return this.CPFCliente;
    }

    public void insereProduto(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> getProdutos(){
        return this.produtos;
    }
}
