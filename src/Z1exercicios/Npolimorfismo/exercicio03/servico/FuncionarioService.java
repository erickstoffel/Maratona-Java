package Z1exercicios.Npolimorfismo.exercicio03.servico;

import Z1exercicios.Npolimorfismo.exercicio03.dominio.Funcionario;

public class FuncionarioService {
    public static void imprimirSalario(Funcionario f) {
        System.out.println("Funcionario: "+f.getNome()+"\nSalario: "+f.calcularSalario());
    }
}
