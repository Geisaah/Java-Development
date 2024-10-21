package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Calculator;

public class CalculatorTest3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.modifyTwoNumbers(num1,num2);
        System.out.println("inside CalculatorTest3");
        System.out.println("Num1 " +num1);
        System.out.println("Num2 " +num2);


    }
}
