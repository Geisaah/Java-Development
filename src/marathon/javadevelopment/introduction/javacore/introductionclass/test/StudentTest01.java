package marathon.javadevelopment.introduction.javacore.introductionclass.test;

import marathon.javadevelopment.introduction.javacore.introductionclass.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
