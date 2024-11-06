package marathon.javadevelopment.introduction.javacore.polymorphism.test;

import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Computer;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Product;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Tomato;
import marathon.javadevelopment.introduction.javacore.polymorphism.service.CalculateTax;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);


        Tomato tomato = new Tomato("Americano", 20);
        tomato.setExpirationDate("11/12/2025");

        CalculateTax.Calculatetax(tomato);
        System.out.println("-------------");
        CalculateTax.Calculatetax(product);

    }
}
