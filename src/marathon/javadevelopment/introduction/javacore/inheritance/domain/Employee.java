package marathon.javadevelopment.introduction.javacore.inheritance.domain;

public class Employee extends Person {

    private double salary;

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
