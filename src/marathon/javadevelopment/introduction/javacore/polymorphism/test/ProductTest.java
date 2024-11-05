package marathon.javadevelopment.introduction.javacore.polymorphism.test;

import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Computer;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Television;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Tomato;
import marathon.javadevelopment.introduction.javacore.polymorphism.service.CalculateTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10I7",11000);
        Tomato tomato = new Tomato("Tomato cereja", 10);
        Television television = new Television("Samsung 50\" ", 2500);

        CalculateTax.Calculatetax(computer);
        System.out.println("----------");
        CalculateTax.Calculatetax(tomato);
        System.out.println("----------");
        CalculateTax.Calculatetax(television);
    }
}
