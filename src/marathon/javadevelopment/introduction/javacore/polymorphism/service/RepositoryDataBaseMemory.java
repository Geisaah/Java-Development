package marathon.javadevelopment.introduction.javacore.polymorphism.service;

import marathon.javadevelopment.introduction.javacore.polymorphism.repository.Repository;

public class RepositoryDataBaseMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory ");
    }
}
