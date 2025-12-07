package Atividade2;

public class Produto {
    String codigoProduto;
    String nome;
    double preco;
    boolean vendido;

    public Produto(String codigo, String nome, double preco){
        this.codigoProduto = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo(){
        return this.codigoProduto;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setStatus(boolean vendido){
        this.vendido = vendido;
    }

    public boolean getStatus(){
        return this.vendido;
    }
}
