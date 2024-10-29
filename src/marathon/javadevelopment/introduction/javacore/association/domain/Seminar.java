package marathon.javadevelopment.introduction.javacore.association.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Location location;

    public Seminar(String title, Location location) {
        this.title = title;
        this.location = location;
    }



    public Seminar(String title, Student[] students, Location location) {
        this.title = title;
        this.students = students;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
