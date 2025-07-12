package Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading Database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission... Database...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na classe DatabaseLoader");
    }
}
