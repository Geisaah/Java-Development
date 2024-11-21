package marathon.javadevelopment.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("foulder");
        boolean isDirectoryCreate = fileDirectory.mkdir();
        System.out.println(isDirectoryCreate);
       // File fileFileDirectory = new File("C:\\Users\\GEISA\\OneDrive\\Documentos\\Geisa\\Java-development\\java-development\\foulder\\file.txt");
        File fileFileDirectory = new File(fileDirectory,"file.txt");
        boolean isFileCreated = fileFileDirectory.createNewFile();
        System.out.println(isFileCreated);
        
        File fileRenamed = new File(fileFileDirectory,"file_renamed.txt");
        boolean isRenamed = fileFileDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);
        
        File directoryRenamed = new File("foulder2");
        boolean isRenamedDirectory = fileDirectory.renameTo(directoryRenamed);
        System.out.println(isRenamedDirectory);
    }
}
