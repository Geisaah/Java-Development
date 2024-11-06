package marathon.javadevelopment.javacore.exception.exception.domain;

import java.io.FileNotFoundException;

public class Person {

    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("saving person");
    }
}
