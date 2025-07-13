package ZZZexercicios.projetoDelegacia.dominio.enums;

public enum Casos {
    ASSASINATO("Assasinato", 1),
    INVESTIGACAO("Investigacao", 2),
    ROUBO("Roubo", 3);

    private final String CASO;
    private final int ID;

    Casos(String CASO, int ID) {
        this.CASO = CASO;
        this.ID = ID;
    }

    public String getCASO() {
        return CASO;
    }

    public int getID() {
        return ID;
    }
}
