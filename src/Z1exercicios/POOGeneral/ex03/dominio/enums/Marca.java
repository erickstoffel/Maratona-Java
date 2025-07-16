package Z1exercicios.POOGeneral.ex03.dominio.enums;

public enum Marca {
    AUDI("Audi", 1),
    BMW("Bmw", 2),
    FIAT("Fiat", 3),
    FORD("Ford", 4),
    HONDA("Honda", 5),
    JEEP("Jeep", 6),
    MERCEDES_BENZ("Mercedes-Benz", 7),
    NISSAN("Nissan", 8),
    TOYOTA("Toyota", 9),
    VOLKSWAGEN("Volkswagen", 10),
    VOLVO("Volvo", 11);

    public final String MARCA;
    public final int ID;

    Marca(String MARCA, int ID) {
        this.MARCA = MARCA;
        this.ID = ID;
    }
}
