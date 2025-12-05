package Atividade1;



public class Estagiario extends Funcionario {

    public Estagiario(String nome, String cpf, double saldo){
        super(nome, cpf, saldo);
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

    @Override
    public double calculaSalario(){
        double salario = 1600;
        double novoSalario = salario + getSaldo();
        setSaldo(novoSalario);

        return salario;
    }
}