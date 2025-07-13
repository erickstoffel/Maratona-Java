package ZZZexercicios.POOGeneral.ex03.dominio;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario = this.salario + this.salario * 0.05;
    }
}
