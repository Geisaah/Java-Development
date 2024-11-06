package marathon.javadevelopment.javacore.exception.exception.test;

import marathon.javadevelopment.javacore.exception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest1 {
    public static void main(String[] args) {
        try {
            Login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void Login() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);
        String usernameDataBase = "Carlos";
        String passwordDataBase = "kkk";
        System.out.println("User");
        String usernameEntered = keyboard.nextLine();
        System.out.println("Password");
        String passwordEntered = keyboard.nextLine();
        if (!usernameDataBase.equals(usernameEntered) || !passwordDataBase.equals(passwordEntered)) {
            throw new InvalidLoginException("User or password invalid");
        }
        System.out.println("User logged in successfully");
    }
}

