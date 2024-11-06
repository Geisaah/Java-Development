package marathon.javadevelopment.introduction.javacore.polymorphism.service;

import marathon.javadevelopment.introduction.javacore.polymorphism.repository.Repository;

public class RepositoryDataBaseFile implements Repository {
    @Override
    public void save() {
        System.out.println("Save to a file");
    }
}
