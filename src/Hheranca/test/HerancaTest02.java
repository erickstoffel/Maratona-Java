package Hheranca.test;

import Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    //1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
    //2 - Alocando espaco em memória pro objeto da classe pai
    //3 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado da classe pai
    //4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    //5 - Construtor da superclasse é executado
    //6 - Alocando espaco em memória pro objeto da subclasse
    //7 - Cada atributo subclasse é criado e inicializado com valores default ou o quer for passado da classe
    //8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    //9 - Construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Erick");


    }
}
