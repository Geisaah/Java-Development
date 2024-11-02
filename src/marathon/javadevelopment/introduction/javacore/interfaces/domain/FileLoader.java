package marathon.javadevelopment.introduction.javacore.interfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("loading data from file");
    }
}
