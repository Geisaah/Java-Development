package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Calculator;

public class CalculatorTest2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       double result = calculator.divideTwoNumbers(20,0);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers(20,0));
        System.out.println("--------------------");
        calculator.printDivideTwoNumbers(86,5);


    }

}
