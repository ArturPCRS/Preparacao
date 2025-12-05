package Atividade2;

public class Cliente {
    String CPF;
    String nome;

    public Cliente(String cpf, String nome){
        this.CPF = cpf;
        this.nome = nome;
    }

    public String getCPF(){
        return this.CPF;
    }

    public String getNome(){
        return this.nome;
    }
}
