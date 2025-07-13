package ZZZexercicios.POOGeneral.ex03.dominio;

import ZZZexercicios.POOGeneral.ex03.service.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    private String departamento;

    public Gerente(String nome, int idade, String cpf, double salario, String departamento) {
        super(nome, idade, cpf, salario);
        this.departamento = departamento;
        calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public boolean autenticar(String senha) {
        if(senha.equals("admin123")){
            return true;
        }else{
            return false;
        }
    }
}
