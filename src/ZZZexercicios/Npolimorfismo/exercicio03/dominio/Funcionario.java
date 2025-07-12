package ZZZexercicios.Npolimorfismo.exercicio03.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}
