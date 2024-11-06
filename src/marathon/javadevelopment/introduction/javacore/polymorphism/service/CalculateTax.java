package marathon.javadevelopment.introduction.javacore.polymorphism.service;

import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Computer;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Product;
import marathon.javadevelopment.introduction.javacore.polymorphism.domain.Tomato;

public class CalculateTax {

    public static void Calculatetax(Product product){
        System.out.println("Report the tax");
        double tax = product.calculateTax();
        System.out.println("Product: " +product.getName());
        System.out.println("Value: " +product.getValue());
        System.out.println("Tax to be paid: " + tax);
        if(product instanceof Tomato) {
            Tomato tomato = (Tomato) product;

            System.out.println(((Tomato) product).getExpirationDate());
        }
    }
}

