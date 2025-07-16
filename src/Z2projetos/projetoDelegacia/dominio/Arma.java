package Z2projetos.projetoDelegacia.dominio;

public class Arma {
    private String nome;
    private int nivelAutoridade;
    private int municao;
    private final int MUNICAO_MAXIMA;

    public Arma(int MUNICAO_MAXIMA, int municao, int nivelAutoridade, String nome) {
        this.MUNICAO_MAXIMA = MUNICAO_MAXIMA;
        this.municao = municao;
        this.nivelAutoridade = nivelAutoridade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelAutoridade() {
        return nivelAutoridade;
    }

    public void setNivelAutoridade(int nivelAutoridade) {
        this.nivelAutoridade = nivelAutoridade;
    }

    public int getMunicao() {
        return municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public int getMUNICAO_MAXIMA() {
        return MUNICAO_MAXIMA;
    }
}
