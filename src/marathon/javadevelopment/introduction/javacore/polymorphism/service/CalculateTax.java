package marathon.javadevelopment.introduction.javacore.polymorphism.service;

import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Computer;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Tomato;

public class CalculateTax {
    public static void calculateTaxComputer(Computer computer) {
        System.out.println("Tax report of the computer");
        double tax = computer.calculateTax();
        System.out.println("Computer " + computer.getName());
        System.out.println("Value " + computer.getValue());
        System.out.println("Tax to be paid: " + tax);
    }

    public static void calculateTaxTomato(Tomato tomato) {
        System.out.println("Tax report of the tomato");
        double tax = tomato.calculateTax();
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Value " + tomato.getValue());
        System.out.println("Tax to be paid: " + tax);
    }
}

