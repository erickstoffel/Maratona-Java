package ZZZexercicios.POOGeneral.ex03.dominio;

import java.util.ArrayList;

public class Concessionaria {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Carro> carros = new ArrayList<Carro>();

    public void venderCarro(Carro carro) {
        carros.remove(carro);
        System.out.println("Carro vendido com sucesso!");
        System.out.println("Venda de: R$"+carro.getValor());
    }
    public void listarCarros() {
        for (Carro carro : carros) {
            System.out.println("Placa: "+carro.getPlaca());
        }
    }
    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: "+funcionario.getNome());
        }
    }


    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    public void removeFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void addCarro(Carro c) {
        carros.add(c);
    }
    public void removeCarro(Carro c) {
        carros.remove(c);
    }


}
