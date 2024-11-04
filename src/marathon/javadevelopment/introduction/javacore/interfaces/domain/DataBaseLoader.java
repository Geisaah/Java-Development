package marathon.javadevelopment.introduction.javacore.interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remover() {
        System.out.println("Remove data from the database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Check permission the data base");
      //  DataLoader.super.checkPermission();
    }

    public static void retrieverMaxDataSize(){
        System.out.println("inside the  retrieverMaxDataSize in the classe Databaseloader");
    }
}
