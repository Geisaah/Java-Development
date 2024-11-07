package marathon.javadevelopment.introduction.javacore.string.test;

public class StringTest2 {
    public static void main(String[] args) {
        String name = "Evim";
        String numbers = "   012345    ";
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.replace("i","e"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(numbers.length());
        System.out.println(numbers.substring(0,2));
        System.out.println(numbers.trim());


    }
}
