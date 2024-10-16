package marathon.javadevelopment.introduction;

public class LoopEstructures {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count = count + 1;
            //count += 1;
            //count ++;
        }
        do {
            System.out.println("inside do-while");
        } while (count < 10);

        for (int i=0; i < 10; i++){
            System.out.println("for"+i);
        }
    }
}
