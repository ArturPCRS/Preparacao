package Atividade1;
import java.util.List;
import java.util.ArrayList;


public class cadastroFuncionarios {

    List<Funcionario> listaFuncionarios = new ArrayList<>();
    private static cadastroFuncionarios instance;

    public static cadastroFuncionarios getInstance(){
        if (instance == null){
            instance = new cadastroFuncionarios();
        }
        return instance;
    }

    public void cadastroFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public Funcionario getPorCTPS(String CTPS){
        // CTPS é igual ao CPF;
        for (Funcionario f : listaFuncionarios){
            if (f instanceof CLT){
                if (f.getCPF().equals(CTPS)){
                    return f;
                }
            }
            if (f instanceof Estagiario){
                if (f.getCPF().equals(CTPS)){
                    return f;
                }
            }
            if (f instanceof PJ){
                if (f.getCPF().equals(CTPS)){
                    return f;
                }
            }
        }
        return null;
    }

}