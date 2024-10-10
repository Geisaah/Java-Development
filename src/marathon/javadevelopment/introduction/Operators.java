package marathon.javadevelopment.introduction;

public class Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 * number02;
        System.out.println(result);
        System.out.println(number01+number02);
        System.out.println(number02+number01+ " value " +number02+number01);


        // %
        int remainder = 20 % 2;
        System.out.println(remainder);


        // < >  <= >=  ==  !
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;

        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty );
        System.out.println("isTenEqualThanTwenty " + isTenEqualThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);



        // && (AND) || (OR)  !
        int age = 35;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age > 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 &&  salary >= 3381;
        System.out.println("isWithinTheLawGreaterThanThirty " + isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty " + isWithinTheLawLessThanThirty);


        double totalValueOfCurrentAccount = 200;
        double totalValueOfCurrentSavingsAccount = 10000;
        float valuePlaystation = 5000F;
        boolean isPlaystationFivePurchasable = totalValueOfCurrentAccount > valuePlaystation  || totalValueOfCurrentSavingsAccount > valuePlaystation;
        System.out.println("isPlaystationFivePurchasable " + isPlaystationFivePurchasable );


        // = += -= *= /= %/
        double bonus = 1800;
        bonus = bonus + 1000; //2800
        bonus += 1000; //3800
        bonus -= 1000; //2800
        bonus *= 2; // 3600
        bonus /= 2; //900
        bonus %= 2; // 0
        System.out.println(bonus);


        // ++ --
        int counter = 0;
        counter += 1; // counter = counter + 1;
        counter ++;
        counter --;

        System.out.println(counter);
    }
}
