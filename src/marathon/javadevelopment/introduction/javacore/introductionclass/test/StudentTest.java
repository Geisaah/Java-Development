package marathon.javadevelopment.introduction.javacore.introductionclass.test;

import marathon.javadevelopment.introduction.javacore.introductionclass.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Geisa";
        student.age = 21;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);


    }
}
