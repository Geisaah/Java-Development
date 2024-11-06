package marathon.javadevelopment.javacore.exception.exception.test;

import marathon.javadevelopment.javacore.exception.exception.domain.Employee;
import marathon.javadevelopment.javacore.exception.exception.domain.InvalidLoginException;
import marathon.javadevelopment.javacore.exception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverrideWithExceptionTest {
    public static void main(String[] args) throws InvalidLoginException, FileNotFoundException {
        Person person = new Person();
        Employee employee = new Employee();


        employee.save();
    }
}
