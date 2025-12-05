package Atividade2;

public class Pedido {
    String codigoPedido;
    String nomeCliente;

    public Pedido(String codigo, String nome){
        this.codigoPedido = codigo;
        this.nomeCliente = nome;
    }

    public String getCodigoPedido(){
        return this.codigoPedido;
    }

    public String getPedidoCliente(){
        return this.nomeCliente;
    }
}
