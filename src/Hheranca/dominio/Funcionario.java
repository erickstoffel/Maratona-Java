package Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    static{
        System.out.println("Dentro do bloco inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco iniciliazação de Funcionario");
    }
    {
        System.out.println("Dentro do bloco iniciliazação de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Salario do funcionario: " + salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
