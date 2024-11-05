package marathon.javadevelopment.introduction.javacore.polymorphism.test;

import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Computer;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Product;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Tomato;

public class ProductTest1 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculateTax());
        System.out.println("--------------------------");
        Product product2 = new Tomato("Americano", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());
    }
}
