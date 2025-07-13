package ZZZexercicios.POOGeneral.ex01.dominio;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
        calcularBonus();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nLinguagem: " + linguagem;
    }

    @Override
    public double calcularBonus() {
        return this.salario = this.salario + salario * 0.1;
    }
}
