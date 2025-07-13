package ZZZexercicios.POOGeneral.ex01.test;

import ZZZexercicios.POOGeneral.ex01.dominio.Desenvolvedor;
import ZZZexercicios.POOGeneral.ex01.dominio.Empresa;
import ZZZexercicios.POOGeneral.ex01.dominio.Funcionario;
import ZZZexercicios.POOGeneral.ex01.dominio.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa();

        Funcionario gerente = new Gerente("Maria", "155.155.155-15", 10000, "Esportes");
        Funcionario dev1 = new Desenvolvedor("Erick", "044.780.200-35", 20000, "Java");
        Funcionario dev2 = new Desenvolvedor("Pedro", "888.888.888-88", 15000, "Python");

        emp.adicionarFuncionario(gerente);
        emp.adicionarFuncionario(dev1);
        emp.adicionarFuncionario(dev2);
        emp.listarFuncionarios();

        System.out.println(((Gerente) gerente).autenticar("admin123"));
    }
}
