package marathon.javadevelopment.javacore.exception.exception.test;

import marathon.javadevelopment.javacore.exception.exception.domain.Reader1;
import marathon.javadevelopment.javacore.exception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourceTest {
    public static void main(String[] args) {
        readFile();

    }
    public static void readFile() {
        try(Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2()){

        }catch (IOException e){

        }
    }

    public static void readFile2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
