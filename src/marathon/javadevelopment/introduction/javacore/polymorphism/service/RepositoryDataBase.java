package marathon.javadevelopment.introduction.javacore.polymorphism.service;

import marathon.javadevelopment.introduction.javacore.polymorphism.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Saving the database");
    }
}
