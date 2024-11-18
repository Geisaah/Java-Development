package marathon.javadevelopment.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
       try(FileReader fr = new FileReader(file)){
          // char[] in = new char[1];
         //  fr.read(in);
         //  for(char c : in){
         //      System.out.println(c);
         //  }
          // System.out.println(fr.read());
           int i;
           while ((i=fr.read())== -1){
               System.out.println((char) i);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
