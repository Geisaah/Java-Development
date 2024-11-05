package marathon.javadevelopment.introduction.javacore.polymorphism.domain;

public class Television extends Product {
    public static final double TAX_PERCENT = 0.21;
    public Television(String name, double value) {
        super(name, value);
    }
    @Override
    public double calculateTax() {
        System.out.println("Calculate tax the Television");
        return this.value * TAX_PERCENT ;
    }

}
