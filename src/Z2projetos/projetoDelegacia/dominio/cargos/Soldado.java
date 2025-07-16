package Z2projetos.projetoDelegacia.dominio.cargos;

import Z2projetos.projetoDelegacia.dominio.Endereco;
import Z2projetos.projetoDelegacia.dominio.Oficial;
import Z2projetos.projetoDelegacia.dominio.enums.Sexo;

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
