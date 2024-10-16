package marathon.javadevelopment.introduction;

public class ConditionalEstructuresSwitch1 {
    public static void main(String[] args) {
        //using switch and gives the values from 1 to 7, print whether the day is a weekday or a weekend
        // consider 1 as sunday.
        byte day = 3;
        switch (day){
            case 1:
            case 7:
                System.out.println("weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekday");
                break;
                default:
                    System.out.println("invalid option");
                    break;
        }

    }
}
