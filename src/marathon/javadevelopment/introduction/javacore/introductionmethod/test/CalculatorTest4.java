package marathon.javadevelopment.introduction.javacore.introductionmethod.test;

import marathon.javadevelopment.introduction.javacore.introductionmethod.domain.Calculator;

public class CalculatorTest4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1,2,3,4,5};
        calculator.addArray(numbers);
        //or
        calculator.addArgs(1,2,3,4,5,6,7);
    }


}
