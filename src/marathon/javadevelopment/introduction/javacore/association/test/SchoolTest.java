package marathon.javadevelopment.introduction.javacore.association.test;


import marathon.javadevelopment.introduction.javacore.association.domain.School;
import marathon.javadevelopment.introduction.javacore.association.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Luma");
        Teacher teacher2 = new Teacher("Anni");
        Teacher[] teachers = {teacher, teacher2};
        School school = new School("Unitec", teachers);

        school.print();
    }
}
