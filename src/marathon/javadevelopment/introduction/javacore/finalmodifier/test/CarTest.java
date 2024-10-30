package marathon.javadevelopment.introduction.javacore.finalmodifier.test;

import marathon.javadevelopment.introduction.javacore.finalmodifier.domain.Car;
import marathon.javadevelopment.introduction.javacore.finalmodifier.domain.Ferrari;
import marathon.javadevelopment.introduction.javacore.finalmodifier.domain.Purchase;

public class CarTest {
    public static void main(String[] args) {
     Car car = new Car();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.PURCHASE);
        car.PURCHASE.setName("Lorena");
        System.out.println(car.PURCHASE);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Michelle");
        ferrari.print();
    }
}
