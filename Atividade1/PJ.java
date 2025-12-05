package Atividade1;



public class PJ extends Funcionario {

    int horasTrabalhadas;

    public PJ(String nome, String cpf, double saldo){
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

    public void setHorastrabalhadas(int h){
        this.horasTrabalhadas = h;
    }

    public int getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }

    public double calculaSalario() {
        double valor = 96 * getHorasTrabalhadas();
        double novoSaldo = valor + getSaldo();
        setSaldo(novoSaldo);

        return valor;
    }
}