package ZZZexercicios.POOGeneral.ex03.dominio.enums;

public enum Cor {
    BRANCO("Branco", 1),
    PRETO("Preto", 2),
    VERMELHO("Vermelho", 3),
    AZUL("Azul", 4);

    public final String COR;
    public final int ID;

    Cor(String COR, int ID) {
        this.COR = COR;
        this.ID = ID;
    }
}
