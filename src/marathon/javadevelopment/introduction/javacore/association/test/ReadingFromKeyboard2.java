package marathon.javadevelopment.introduction.javacore.association.test;

import java.util.Scanner;

public class ReadingFromKeyboard2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Future Prediction");
        System.out.println("type your question, and I will answer yes or no");
        String question = input.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}