package Atividade1;


public abstract class Funcionario {

    String Nome;
    String CTPS;
    String CPF;
    double Saldo;

    public Funcionario(String nome, String cpf, double saldo){
        this.Nome = nome;
        this.CPF = cpf;
        this.Saldo = saldo;
    }

    public void setSaldo(double saldo){
        this.Saldo = saldo;
    }

    public String getNome(){
        return this.Nome;
    }

    public String getCPF(){
        return this.CPF;
    }

    public double getSaldo(){
        return this.Saldo;
    }

    public abstract double calculaSalario();
}