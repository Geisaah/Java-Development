package marathon.javadevelopment.introduction;

public class ConditionalEstructures2 {
    public static void main(String[] args) {
        // donate if salary > 5000
        double salary = 6000;
        String donationMessage = "I am going to donation 500 to DevDojo";
        String notDonationMessage = "I dont have the means yet, but I will";
        String result;
        if(salary > 5000) {
            result = donationMessage;
        }else {
            result = notDonationMessage;
        }
        System.out.println(result);

        // Ternary Operator
        // (condition) ? true : false
        String results = salary > 5000 ? donationMessage : notDonationMessage;
        // String results = salary > 5000 ? ""I am going to donation 500 to DevDojo" : "I dont have the means yet, but I will";



    }
}
