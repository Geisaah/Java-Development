package marathon.javadevelopment.introduction.javacore.staticmodifier.Test;

import marathon.javadevelopment.introduction.javacore.staticmodifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 250);
        Car car2 = new Car("mercedes", 260);
        Car car3 = new Car("Ferrari", 280);

       Car.setLimitSpeed(180);

        car1.print();
        car2.print();
        car3.print();

    }
}
