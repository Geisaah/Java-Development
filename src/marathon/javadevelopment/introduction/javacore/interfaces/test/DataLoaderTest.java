package marathon.javadevelopment.introduction.javacore.interfaces.test;

import marathon.javadevelopment.introduction.javacore.interfaces.domain.DataBaseLoader;
import marathon.javadevelopment.introduction.javacore.interfaces.domain.DataLoader;
import marathon.javadevelopment.introduction.javacore.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieverMaxDataSize();
        DataBaseLoader.retrieverMaxDataSize();
    }
}
