package ZZZexercicios.projetoDelegacia.dominio;

public class Endereco {
    private String cidade;
    private String bairo;

    public Endereco(String cidade, String bairo) {
        this.cidade = cidade;
        this.bairo = bairo;
    }

    public void imprimir() {
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairo);
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairo() {
        return bairo;
    }
}
