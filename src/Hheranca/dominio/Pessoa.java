package Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco inicialização estático de Pessoa");
    }
    {
        System.out.println("Dentro do bloco iniciliazação de Pessoa");
    }
    {
        System.out.println("Dentro do bloco iniciliazação de Pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do constructor de Pessoa");
        this.nome = nome;
    }
  
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua()+" "+this.endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
