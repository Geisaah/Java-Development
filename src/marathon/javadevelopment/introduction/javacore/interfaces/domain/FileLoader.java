package marathon.javadevelopment.introduction.javacore.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("loading data from file");
    }

    @Override
    public void remover() {
        System.out.println("Remove data from a file");
    }
    @Override
    public void checkPermission() {
        System.out.println("Check permission the file");
        //  DataLoader.super.checkPermission();
    }
}
