package marathon.javadevelopment.introduction.javacore.string.test;

public class StringTest {
    public static void main(String[] args) {
        String name = "Geisa "; //String constant pool
        String name2 = "Maya ";
        name = name.concat(" Freitas");
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Geisa");
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
