package marathon.javadevelopment.javacore.regex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Miguell, Beatriz, Maya";
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());

        }

    }
}
