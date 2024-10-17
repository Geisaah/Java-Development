package marathon.javadevelopment.introduction;

public class Arrays1 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double value is 0
        //char '\u0000'
        //boolean false
        // String null

        String[] name = new String[3];
        name[0] = "Geisa";
        name[1] = "Maya";
        name[2] = "Manuela";

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
    }
}
