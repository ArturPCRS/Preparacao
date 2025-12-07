package Atividade2;

import java.util.HashMap;
import java.util.Map;

public class Produto {
    String codigoProduto;
    String nome;
    double preco;
    boolean noCarrinho;
    boolean vendido;
    Integer numeroQuantidade = 0;

    Map<Produto, Integer> quantidadeVendida = new HashMap<>();

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

    public void setVendido(boolean status){
        this.vendido = status;
    }

    public void setnoCarrinho(boolean status){
        this.noCarrinho = status;
    }

    public boolean getVendido(){
        return this.vendido;
    }

    public boolean getNoCarrinho(){
        return this.noCarrinho;
    }

    public void setQuantidadeVendida(Produto produto){
        if (produto.getVendido() == true){
            numeroQuantidade++;
            quantidadeVendida.put(produto, numeroQuantidade);
        }
    }

    public Integer getQuantidadeVendida(){
        return numeroQuantidade;
    }
}
