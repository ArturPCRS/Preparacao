package Atividade1;



public class CLT extends Funcionario {

    public CLT(String nome, String cpf, double saldo){
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
        double salario = 1350;
        double novoSalario = salario + getSaldo();
        setSaldo(novoSalario);

        return salario;
    }
}