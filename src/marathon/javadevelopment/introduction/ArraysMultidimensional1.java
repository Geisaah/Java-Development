package marathon.javadevelopment.introduction;

public class ArraysMultidimensional1 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        for (int[] arrayBase: arrayInt){
            System.out.println("\n----");
            for (int num: arrayBase){
                System.out.print(num + " ");

            }
        }
    }
}