package ZZZexercicios.projetoDelegacia.dominio.cargos;

import ZZZexercicios.projetoDelegacia.dominio.Endereco;
import ZZZexercicios.projetoDelegacia.dominio.Oficial;
import ZZZexercicios.projetoDelegacia.dominio.enums.Sexo;

public class Soldado extends Oficial{
    public Soldado(String nome, int idade, String cpf, Sexo sexo, Endereco endereco) {
        super(nome, idade, cpf, sexo, endereco);
    }

    @Override
    public String setDistintivoID() {
        return "1";
    }

    @Override
    public double setSalario() {
        return 5944.85;
    }

    @Override
    public void imprimir() {
        System.out.println("Cargo: Soldado");
        super.imprimir();
    }
}
