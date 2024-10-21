package marathon.javadevelopment.introduction.javacore.introductionmethod.domain;

public class Calculator {
    public void addTwonumbers(){
        System.out.println(10 + 20);
    }

    public void subtractTwoNumbers(){
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);

    }

    public double divideTwoNumbers( double num1, double num2){
        return num1/num2;

    }

    public void printDivideTwoNumbers(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Division by 0 is not allowed");
        }
        System.out.println(num1/num2);
    }

    public void modifyTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("inside the modifyTwoNumbers method");
        System.out.println("Num1 " +num1);
        System.out.println("Num2 " +num2);

    }
}
