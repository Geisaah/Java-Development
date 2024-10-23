package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Carlos");
        person.setAge(54);
      //  person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
