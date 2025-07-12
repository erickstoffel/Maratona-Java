package Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing file...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission... FileLoader...");
    }
}
