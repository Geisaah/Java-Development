package marathon.javadevelopment.introduction.javacore.association.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String specialty, String name) {
        this.specialty = specialty;
        this.name = name;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("----------------");
        System.out.println("Teacher; "+ this.name);
        if(this.seminars == null) return;
        System.out.println(" ##Registered Seminars## ");
        for (Seminar seminar : this.seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocation().getAdress());
            if(seminar.getStudents() == null || seminar.getStudents().length==0) continue;
            System.out.println("Student");
            for (Student student : seminar.getStudents()) {
                System.out.println("Student : " +student.getName()+ " age " + student.getAge());

            }

        }

    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
