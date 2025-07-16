package Z2projetos.projetoDelegacia2.dominio.enums;

public enum Crime {
    ASSALTO("Assalto", 0),
    TRAFICO("Trafico", 0),
    ASSASINATO("Assinato", 1),
    INVESTICACAO("Investicacao", 2);

    private final String NOME;
    private final int nivelAcesso;

    Crime(String NOME, int nivelAcesso) {
        this.NOME = NOME;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNOME() {
        return NOME;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }
}
