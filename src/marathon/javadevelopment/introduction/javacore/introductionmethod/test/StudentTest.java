package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.PrintStudent;
import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        PrintStudent print = new PrintStudent();

        student1.name = "Miguell";
        student1.age = 5;
        student1.sex = 'M';

        student2.name = "Beatriz";
        student2.age = 7;
        student2.sex = 'F';

        print.print(student1);

        print.print(student2);

        System.out.println("-------------------------");

        print.print(student1);

        print.print(student2);

        System.out.println("name " + student1.name + " age " + student1.age + " sex " + student1.sex);
        //or
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.sex);

        System.out.println("-------------------------------------");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.sex);

    }
}
