package marathon.javadevelopment.introduction;

public class ConditionalEstructuresSwitch {
    public static void main(String[] args) {
        // print the day of the weeks, considering 1 as sunday
        byte day = 8;
        // char, int,byte, short, enum, string
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid option");
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            default:
                System.out.println("invalid");
                break;
        }


    }
}
