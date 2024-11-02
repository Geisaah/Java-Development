package marathon.javadevelopment.introduction.javacore.abstractclasses.test;

import marathon.javadevelopment.introduction.javacore.abstractclasses.domain.Developer;
import marathon.javadevelopment.introduction.javacore.abstractclasses.domain.Employee;
import marathon.javadevelopment.introduction.javacore.abstractclasses.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Pito", 4000);
        Developer developer = new Developer("Geisa",5000);

        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
