package marathon.javadevelopment.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        createNewFile();
    }
    private static void createNewFile(){
        File file = new File("File\\test.txt");
        try{
           boolean isCreate = file.createNewFile();
            System.out.println("Create File" +isCreate);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
