package marathon.javadevelopment.introduction.javacore.introductionmethod.domain;

public class PrintStudent {
    public void print(Student student) {

        System.out.println("-------------------------------------");

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        student.name = "Manu";
    }
}
