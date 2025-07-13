package ZZZexercicios.projetoDelegacia.test;

import ZZZexercicios.projetoDelegacia.dominio.*;
import ZZZexercicios.projetoDelegacia.dominio.cargos.Soldado;
import ZZZexercicios.projetoDelegacia.dominio.enums.Casos;
import ZZZexercicios.projetoDelegacia.dominio.enums.Sexo;

public class Test01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Nova Petropolis", "Linha Temeraria");
        Endereco endereco2 = new Endereco("Caxias do Sul", "Centro");

        Oficial soldado1 = new Soldado("Erick", 21, "111.111.111-11", Sexo.MASCULINO, endereco1);
        Pessoa civil1 = new Pessoa("Maria", 19, "222.222.222-22", Sexo.FEMININO, endereco2);


        BoletimOcorrencia bo1 = new BoletimOcorrencia("Tropeiro colorado", "Um cara matou outro por muier", 1, civil1, Casos.ASSASINATO, soldado1);
        Delegacia dp1 = new Delegacia();

        dp1.cadastrarOficial(soldado1);
        dp1.adicionarBO(bo1);
        soldado1.imprimir();
        System.out.println("----------------");
        dp1.listarCasos();
        System.out.println("----------------");
        dp1.listarOficials();
        System.out.println("----------------");
        dp1.resolverBO(bo1);
        System.out.println("----------------");
        soldado1.imprimir();
        System.out.println("----------------");
        dp1.listarCasos();

    }
}
