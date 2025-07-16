package Z1exercicios.POOGeneral.ex03.test;

import Z1exercicios.POOGeneral.ex03.dominio.*;
import Z1exercicios.POOGeneral.ex03.dominio.enums.Cor;
import Z1exercicios.POOGeneral.ex03.dominio.enums.Marca;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro(Marca.NISSAN, "Versa", Cor.PRETO, "AAA-1234", 30000);
        Carro c2 = new Carro(Marca.NISSAN, "Sentra", Cor.BRANCO, "BBB-1234", 50000);
        Carro c3 = new Carro(Marca.BMW, "320i", Cor.AZUL, "CCC-1234", 120000);

        Funcionario funcionario1 = new Gerente("Maria", 25, "001.002.003-04", 15000, "Vendas");
        Funcionario funcionario2 = new Vendedor("Erick", 50, "111.222.333-44", 50000);
        Funcionario funcionario3 = new Vendedor("Pedro", 32, "999.888.777-66", 5000);

        Cliente cliente1 = new Cliente("John Doe", 18,"123.456.789-00");

        Concessionaria concessionaria = new Concessionaria("Erick Veiculos");

        concessionaria.addFuncionario(funcionario1);
        concessionaria.addFuncionario(funcionario2);
        concessionaria.addFuncionario(funcionario3);

        concessionaria.addCarro(c1);
        concessionaria.addCarro(c2);
        concessionaria.addCarro(c3);

        concessionaria.listarCarros();
        concessionaria.listarFuncionarios();

        concessionaria.venderCarro(c3);
        concessionaria.listarCarros();
    }
}
