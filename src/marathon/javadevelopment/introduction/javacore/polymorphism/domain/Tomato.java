package marathon.javadevelopment.introduction.javacore.polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENT = 0.06;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculate tax the tomato");
        return this.value * TAX_PERCENT;
    }
}
