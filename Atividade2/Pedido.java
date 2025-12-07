package Atividade2;

public class Pedido {
    String codigoPedido;
    String CPFCliente;

    public Pedido(String codigo, String CPF){
        this.codigoPedido = codigo;
        this.CPFCliente = CPF;
    }

    public String getCodigoPedido(){
        return this.codigoPedido;
    }

    public String getPedidoCliente(){
        return this.CPFCliente;
    }
}
