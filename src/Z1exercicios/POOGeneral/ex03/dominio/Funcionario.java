package Z1exercicios.POOGeneral.ex03.dominio;

public abstract class Funcionario extends Pessoa{
    protected double salario;

    public Funcionario(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
