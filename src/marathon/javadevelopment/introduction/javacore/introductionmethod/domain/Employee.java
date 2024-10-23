package marathon.javadevelopment.introduction.javacore.introductionmethod.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salary : salary) {
            System.out.print(salary + " ");
        }
        printSalaryAverage();
        //System.out.println(this.salary[0]);
        //System.out.println(this.salary[1]);
        //System.out.println(this.salary[2]);
    }

    public void printSalaryAverage() {
        // double average = 0;
        for (double salary : salary) {
            average += salary;
        }
        average /= salary.length;
        System.out.println("\nAverage salary " + average);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalary() {
        return salary;
    }

    public double getAverage() {
        return average;
    }
}
