package marathon.javadevelopment.introduction.javacore.interfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("perfoming permission check");
    }
    public static void retrieverMaxDataSize(){
        System.out.println("inside the  retrieverMaxDataSize in the interface");
    }
}
