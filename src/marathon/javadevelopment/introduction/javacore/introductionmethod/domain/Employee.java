package marathon.javadevelopment.introduction.javacore.introductionmethod.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salary: salary){
            System.out.print(salary + " ");
        }
        printSalaryAverage();
        //System.out.println(this.salary[0]);
        //System.out.println(this.salary[1]);
        //System.out.println(this.salary[2]);
    }

    public void printSalaryAverage(){
        double average = 0;
        for (double salary: salary){
            average += salary;
        }
        average /= salary.length;
        System.out.println("\nAverage salary " +average);
    }
}
