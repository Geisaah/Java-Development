package marathon.javadevelopment.introduction.javacore.introductionclass.test;

import marathon.javadevelopment.introduction.javacore.introductionclass.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        car.name = "Ferrari";
        car.model = "ABC";
        car.year = 2010;

        car1.name = "Jeep";
        car1.model = "Adventure";
        car1.year = 2015;

        System.out.println("name: "+ car.name + " model: "+ car.model + " year: "+ car.year);
        System.out.println("----------------------------------------");
        System.out.println("name: "+ car1.name + " model: "+ car1.model + " year: "+ car1.year);
    }
}
