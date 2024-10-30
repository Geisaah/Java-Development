package marathon.javadevelopment.introduction.javacore.inheritance.domain;

public class Employee extends Person {

    private double salary;

    static {
        System.out.println("inside the initialization static block Employee");
    }

    {
        System.out.println("inside the initialization  block Employee 1");
    }

    {
        System.out.println("inside the initialization  block Employee 2");
    }

    public Employee(String name){
        super(name);
        System.out.println("inside the Employee constructor");
    }

    public void print() {
        super.print();
    }

    public void PaymentReport() {
        System.out.println("I " + this.name + " I received a salary of " + this.salary);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
