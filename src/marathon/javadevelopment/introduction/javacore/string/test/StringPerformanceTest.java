package marathon.javadevelopment.introduction.javacore.string.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        conctString(10_000);
        long end = System.currentTimeMillis();
        System.out.println("time spent for String" + (end - star) + "ms");

        star = System.currentTimeMillis();
        conctStringBuilder(10_000);
        end = System.currentTimeMillis();
        System.out.println("time spent for StringBuilder" + (end - star) + "ms");

        star = System.currentTimeMillis();
        conctStringBuffer(10_000);
        end = System.currentTimeMillis();
        System.out.println("time spent for StringBuffer" + (end - star) + "ms");
    }

    private static void conctString(int size) {
        String text = " ";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }


    private static void conctStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }



    private static void conctStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
