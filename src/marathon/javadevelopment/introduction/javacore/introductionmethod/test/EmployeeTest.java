package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Evim");
        employee.setAge(29);
        employee.setSalary(new double[]{1200, 987.32,2000});
        employee.print();
        employee.printSalaryAverage();
        System.out.println("Employee" + employee.getAverage());
    }
}
