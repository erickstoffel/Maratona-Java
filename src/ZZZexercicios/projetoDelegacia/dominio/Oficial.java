package ZZZexercicios.projetoDelegacia.dominio;

import ZZZexercicios.projetoDelegacia.dominio.enums.Sexo;

import java.util.ArrayList;
import java.util.List;

public abstract class Oficial extends Pessoa{
    private String distintivoID;
    private double salario;
    private int casosResolvidos;
    private List<BoletimOcorrencia> casosAbertos;

    public Oficial(String nome, int idade, String cpf, Sexo sexo, Endereco endereco) {
        super(nome, idade, cpf, sexo, endereco);
        this.distintivoID = setDistintivoID();
        this.salario = setSalario();
        this.casosResolvidos = 0;
        this.casosAbertos = new ArrayList<>();
    }

    public abstract String setDistintivoID();
    public abstract double setSalario();

    public void adicionarCaso(BoletimOcorrencia boletimOcorrencia) {
        this.casosAbertos.add(boletimOcorrencia);
    }
    public void adicionarCasosResolvidos() {
        this.casosResolvidos ++;
    }
    public void removerCaso(BoletimOcorrencia boletimOcorrencia){
        this.casosAbertos.remove(boletimOcorrencia);
    }

    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Endereco: ");
        getEndereco().imprimir();
        System.out.println("Distintivo ID: " + distintivoID);
        System.out.println("Salario: " + salario);
        System.out.println("Casos Resolvidos: " + casosResolvidos);
        System.out.println("Casos Abertos: ");
        imprimirCasosAbertos();
    }

    private void imprimirCasosAbertos(){
        for (BoletimOcorrencia casosAberto : this.casosAbertos) {
            System.out.println(casosAberto.getNome());
            System.out.println(casosAberto.getTipoCasos().getCASO());
            System.out.println(casosAberto.getId());
        }
    }
}
