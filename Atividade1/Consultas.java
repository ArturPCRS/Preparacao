package Atividade1;
import java.util.List;
import java.util.Optional;

public class Consultas {

    private static Consultas instance;

    public static Consultas getInstance(){
        if (instance == null){
            instance = new Consultas();
        }
        return instance;
    }

    public void geraFolhaMensal(String CPF){
        cadastroFuncionarios cf = cadastroFuncionarios.getInstance();
        
        List<Funcionario> funcionario = cf.listaFuncionarios.stream().toList();

        for (Funcionario f : funcionario){
            if (f instanceof CLT && f.getCPF().equals(CPF)){
                System.out.println("// // // // // // // // // // // // // // // // // // // // // // // // //");
                System.out.println("Funcionário: " + f.getNome() + "\tCPF: " + f.getCPF() + "\tSalário recebido " + f.calculaSalario());
                System.out.println("// // // // // // // // // // // // // // // // // // // // // // // // //");
            }
            if (f instanceof Estagiario && f.getCPF().equals(CPF)){
                System.out.println("// // // // // // // // // // // // // // // // // // // // // // // // //");
                System.out.println("Funcionário: " + f.getNome() + "\tCPF: " + f.getCPF() + "\tSalário recebido " + f.calculaSalario());
                System.out.println("// // // // // // // // // // // // // // // // // // // // // // // // //");
            }
            if (f instanceof PJ && f.getCPF().equals(CPF)){
                System.out.println("// // // // // // // // // // // // // // // // // // // // // // // // //");
                System.out.println("Funcionário: " + f.getNome() + "\tCPF: " + f.getCPF() + "\tSalário recebido " + f.calculaSalario());
                System.out.println("// // // // // // // // // // // // // // // // // // // // // // // // //");
            }
        }
    }

}