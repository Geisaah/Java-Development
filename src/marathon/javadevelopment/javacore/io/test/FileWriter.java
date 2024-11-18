package marathon.javadevelopment.javacore.io.test;

import java.io.File;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
//public class FileWriter1
public class FileWriter {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( java.io.FileWriter fw = new java.io.FileWriter(file)) {
           fw.write("I will succeed");
           fw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
