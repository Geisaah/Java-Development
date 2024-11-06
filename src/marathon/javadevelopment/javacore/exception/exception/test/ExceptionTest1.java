package marathon.javadevelopment.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest1 {
    public static void main(String[] args) throws IOException{

        createNewFile();
    }
    public static void createNewFile() throws IOException{
        File file = new File("File\\test.txt");
        try{
           boolean isCreate = file.createNewFile();
            System.out.println("Create File" +isCreate);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
            //throw new RunTimeException("Problem them create the file");
        }


    }
}
