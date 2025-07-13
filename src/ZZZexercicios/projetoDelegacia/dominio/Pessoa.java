package ZZZexercicios.projetoDelegacia.dominio;

import ZZZexercicios.projetoDelegacia.dominio.enums.Sexo;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private Sexo sexo;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String cpf, Sexo sexo, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
