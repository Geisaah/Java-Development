package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addTwonumbers();
        System.out.println("finish add");
        calculator.subtractTwoNumbers();
        System.out.println("finish subtract");
    }
}
