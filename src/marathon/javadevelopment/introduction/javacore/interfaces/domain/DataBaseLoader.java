package marathon.javadevelopment.introduction.javacore.interfaces.domain;

public class DataBaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }
}
