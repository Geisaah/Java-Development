package marathon.javadevelopment.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        String text = "Miguell,Beatriz,Maya,true,200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
           // System.out.println(scanner.next());
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int "+i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+b);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
