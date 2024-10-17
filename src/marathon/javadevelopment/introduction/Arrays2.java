package marathon.javadevelopment.introduction;

public class Arrays2 {
    public static void main(String[] args) {
        int[] number = new int[3];
        //
        int[] number2 = {1, 2, 3, 4};
        //
        int[] number3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        for (int num : number3) {
            System.out.println(num);
        }
    }
}
