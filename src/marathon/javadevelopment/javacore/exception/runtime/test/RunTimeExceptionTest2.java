package marathon.javadevelopment.javacore.exception.runtime.test;

public class RunTimeExceptionTest2 {
    public static void main(String[] args) {
        openConexion();
    }

    private static String openConexion() {
        try {
            System.out.println("Open file");
            System.out.println("Writing data to the file");
            return "Open conexion";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing the file");
        }
        return null;
    }
}
