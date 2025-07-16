package Z2projetos.projetoDelegacia.dominio.enums;

public enum Sexo {
    MASCULINO("Masculino", 1),
    FEMININO("Feminino", 2);

    private final String SEXO;
    private final int ID;

    Sexo(String sexo, int ID) {
        this.SEXO = sexo;
        this.ID = ID;
    }

    public String getSEXO() {
        return SEXO;
    }

    public int getID() {
        return ID;
    }
}
