package marathon.javadevelopment.introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int ageFather = 32;
        // casting, converting a long to an int
        int ageMother = (int)3200000000L;
        long largerNumber = 100000;
        double salaryDouble = 2000.0D;
        float salaryFloat = 2500.0F;
        byte ageByte = 33;
        short ageShort = 34;
        boolean authentic = true;
        boolean untrue = false;
        char character = 'M';

        String text = "a text / a large text";
        System.out.println("this is " + text);


        System.out.println("The age is " + ageFather + " years");
        System.out.println(salaryFloat);
    }
}
