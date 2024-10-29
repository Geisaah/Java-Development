package marathon.javadevelopment.introduction.javacore.inheritance.test;

import marathon.javadevelopment.introduction.javacore.inheritance.domain.Address;
import marathon.javadevelopment.introduction.javacore.inheritance.domain.Person;
import marathon.javadevelopment.introduction.javacore.inheritance.domain.Employee;



public class inheritanceTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Street 3");
        address.setZipCode("012345-678");
        Person person = new Person();
        person.setName("Beatriz Andrade");
        person.setCpf("12121212");
        person.setAddress(address);
        person.print();

      Employee employee = new Employee();
      employee.setName("Maria Celma");
      employee.setCpf("12121212");
      employee.setAddress(address);
      employee.setSalary(2000);

      employee.print();

    }
}
