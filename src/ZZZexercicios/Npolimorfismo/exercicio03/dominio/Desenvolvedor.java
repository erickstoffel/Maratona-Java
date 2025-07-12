package ZZZexercicios.Npolimorfismo.exercicio03.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return this.salario = this.salario + this.salario * 0.1;
    }
}
