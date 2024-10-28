package marathon.javadevelopment.introduction.javacore.association.test;

import java.util.Scanner;

public class ReadingFromKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name below");
         String name =input.nextLine();
        System.out.println("Enter your age");
       int age = input.nextInt();
        System.out.println("Enter M or F for your gender");
       char gender = input.next().charAt(0);
        System.out.println("----------------");
        System.out.println("Nome "+name);
        System.out.println("Nome "+age);
        System.out.println("Nome "+gender);
    }
}
