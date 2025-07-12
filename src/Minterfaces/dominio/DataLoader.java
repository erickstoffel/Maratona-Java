package Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission(){
        System.out.println("You do not have permission to access this file");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }

}
