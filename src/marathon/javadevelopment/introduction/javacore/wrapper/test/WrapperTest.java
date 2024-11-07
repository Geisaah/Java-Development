package marathon.javadevelopment.introduction.javacore.wrapper.test;

public class WrapperTest {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;

        Byte bytew = 1;  //autoboxing
        Short shortw = 1;
        Integer intw = 1;
        Long longw = 10L;
        Float floatw = 10F;
        Double doublew = 10D;
        Character charw = 'w';
        Boolean booleanw = false;
        

        int i = intw; //unboxing
        Integer intw2 = Integer.parseInt("1");
        Integer intw3 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        
        
    }
    
    
    
    
}
