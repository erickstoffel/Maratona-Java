package Z1exercicios.POOGeneral.ex01.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double calcularBonus();

    public String exibirDados() {
        return "Nome: "+this.nome+"\nCpf: "+this.cpf+"\nSalario: "+this.salario;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
