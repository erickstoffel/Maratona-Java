package Z1exercicios.POOGeneral.ex02.dominio;

public enum MesPublicacao {
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");

    public final String NOME;

    MesPublicacao(String NOME) {
        this.NOME = NOME;
    }
}
