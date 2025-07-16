package Z1exercicios.Npolimorfismo.exercicio03.test;

import Z1exercicios.Npolimorfismo.exercicio03.dominio.Desenvolvedor;
import Z1exercicios.Npolimorfismo.exercicio03.dominio.Funcionario;
import Z1exercicios.Npolimorfismo.exercicio03.dominio.Gerente;
import Z1exercicios.Npolimorfismo.exercicio03.servico.FuncionarioService;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("Maria", 10000);
        Funcionario d1 = new Desenvolvedor("Erick", 12000);

        FuncionarioService.imprimirSalario(g1);
        FuncionarioService.imprimirSalario(d1);
    }
}
