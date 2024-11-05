package marathon.javadevelopment.introduction.javacore.polymorphism.test;

import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Computer;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Tomato;
import marathon.javadevelopment.introduction.javacore.polymorphism.service.CalculateTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10I7",11000);
        Tomato tomato = new Tomato("Tomato cereja", 10);
        CalculateTax.calculateTaxComputer(computer);
        System.out.println("----------");
        CalculateTax.calculateTaxTomato(tomato);
    }
}
