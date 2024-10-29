package marathon.javadevelopment.introduction.javacore.association.test;

import marathon.javadevelopment.introduction.javacore.association.domain.Location;
import marathon.javadevelopment.introduction.javacore.association.domain.Seminar;
import marathon.javadevelopment.introduction.javacore.association.domain.Student;
import marathon.javadevelopment.introduction.javacore.association.domain.Teacher;

public class AssociationTest {
    public static void main(String[] args) {
        Location location = new Location("Rua das Laranjeiras");
        Student student = new Student("Miguell", 7);
        Teacher teacher = new Teacher("Agronomy", "Luma");
        Student[] studentForSeminar = {student};
        Seminar seminar = new Seminar("Green World", studentForSeminar, location);
        Seminar[] seminarsAvailable = {seminar};
        teacher.setSeminars(seminarsAvailable);

        teacher.print();
    }
}
