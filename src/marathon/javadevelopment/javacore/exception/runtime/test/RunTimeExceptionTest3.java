package marathon.javadevelopment.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest3 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException ");
        }

        try {
            thisCodeMightThrowAnException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void thisCodeMightThrowAnException() throws SQLException, FileNotFoundException {

    }
}