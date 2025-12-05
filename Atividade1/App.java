package Atividade1;



public class App {
    public static void main(String[] args) {
        cadastroFuncionarios cf = cadastroFuncionarios.getInstance();
        Consultas c = Consultas.getInstance();

        // String nome, String cpf, double saldo
        CLT clt1 = new CLT("Alberto", "111.111.111-11", 1500);
        Estagiario e1 = new Estagiario("Carlos", "222.222.222-22", 1700);
        PJ pj1 = new PJ("Luan", "333.333.333-33", 1900);

        cf.cadastroFuncionario(clt1);
        cf.cadastroFuncionario(e1);
        cf.cadastroFuncionario(pj1);

        c.geraFolhaMensal("222.222.222-22");
    }
}