package Hheranca.test;

import Hheranca.dominio.Endereco;
import Hheranca.dominio.Funcionario;
import Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Erick");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Jose da Silva");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------");
        funcionario.imprimir();
    }
}
