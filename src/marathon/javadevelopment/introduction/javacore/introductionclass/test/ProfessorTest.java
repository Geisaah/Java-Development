package marathon.javadevelopment.introduction.javacore.introductionclass.test;

import marathon.javadevelopment.introduction.javacore.introductionclass.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Celma";
        professor.age = 55;
        professor.sex = 'F';
        System.out.println("name: " +professor.name + " age: " + professor.age + " sex: " + professor.sex);
    }
}
