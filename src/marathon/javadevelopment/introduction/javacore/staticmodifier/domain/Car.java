package marathon.javadevelopment.introduction.javacore.staticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;

    }

    public void print(){
        System.out.println("-------------------------");
        System.out.println("name "+this.name);
        System.out.println("Max Speed "+this.maxSpeed);
        System.out.println("Limit Speed "+Car.limitSpeed);
    }

    public static void setLimitSpeed(double maxSpeed){
        Car.limitSpeed = limitSpeed;
    }

    public static double getLimitSpeed(){
        return Car.limitSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
