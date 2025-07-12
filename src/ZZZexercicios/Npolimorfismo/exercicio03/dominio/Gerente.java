package ZZZexercicios.Npolimorfismo.exercicio03.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return this.salario = this.salario + this.salario * 0.05;
    }
}
