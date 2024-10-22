package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.PrintStudent;
import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Student;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Miguell";
        student1.age = 5;
        student1.sex = 'M';

        student2.name = "Beatriz";
        student2.age = 7;
        student2.sex = 'F';

        student1.print();
        student2.print();

    }
}
