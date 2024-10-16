package marathon.javadevelopment.introduction;

public class LoopEstructures2 {
    public static void main(String[] args) {
        //Print the first 25 number from a give value. For Example 50
        int valueMax = 50;
        for (int i = 0; i <= valueMax; i++) {
            if (i > 25) {
               break;
            }
            System.out.println(i);
        }
    }
}
