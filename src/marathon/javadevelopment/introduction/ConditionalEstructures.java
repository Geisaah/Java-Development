package marathon.javadevelopment.introduction;

public class ConditionalEstructures {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToBuyAlcohol = age >= 18;

        // !

        if (isAuthorizedToBuyAlcohol) {
            System.out.println("authorized to buy alcohol");
        }else{
            System.out.println("not authorized to buy alcohol");

        }

        if (!isAuthorizedToBuyAlcohol) {
        System.out.println("not authorized to buy alcohol");
        }

    }
}
