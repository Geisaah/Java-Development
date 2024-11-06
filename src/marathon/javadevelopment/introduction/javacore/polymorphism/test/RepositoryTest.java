package marathon.javadevelopment.introduction.javacore.polymorphism.test;

import marathon.javadevelopment.introduction.javacore.polymorphism.repository.Repository;
import marathon.javadevelopment.introduction.javacore.polymorphism.service.RepositoryDataBase;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.save();
    }
}
