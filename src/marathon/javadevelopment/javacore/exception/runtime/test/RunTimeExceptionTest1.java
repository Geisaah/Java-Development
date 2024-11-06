package marathon.javadevelopment.javacore.exception.runtime.test;

public class RunTimeExceptionTest1 {
    public static void main(String[] args) {
        division(1, 0);
    }

    private static int division(int a, int b) throws IllegalArgumentException {
        if (b == 0){
            throw  new RuntimeException("Illegal argument cannot be 0");
        }
       return a/b;
    }
}
