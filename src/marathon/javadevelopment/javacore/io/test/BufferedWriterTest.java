package marathon.javadevelopment.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( java.io.FileWriter fw = new java.io.FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("I will succeed");
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
