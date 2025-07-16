package Z2projetos.projetoDelegacia2.dominio;

public class Arma {
    private String nome;
    private int nivelAcesso;
    private int municao;
    private final int MUNICAO_MAXIMA;

    public Arma(String nome, int nivelAcesso, int MUNICAO_MAXIMA) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
        this.municao = MUNICAO_MAXIMA;
        this.MUNICAO_MAXIMA = MUNICAO_MAXIMA;
    }

    public void atirar(){
        System.out.println("POW!");
        this.municao--;
    }

    public void recarregar() {
        this.municao = MUNICAO_MAXIMA;
    }


    public String getNome() {
        return nome;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public int getMunicao() {
        return municao;
    }

    public int getMUNICAO_MAXIMA() {
        return MUNICAO_MAXIMA;
    }
}
