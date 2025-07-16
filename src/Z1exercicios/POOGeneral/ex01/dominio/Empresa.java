package Z1exercicios.POOGeneral.ex01.dominio;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public void listarFuncionarios(){
        for(Funcionario f : funcionarios){
            System.out.println(f.exibirDados());
        }
    }
}
