package marathon.javadevelopment.introduction;

public class ConditionalEstructures3 {
    public static void main(String[] args) {
        // I want to know much I have to pay in the Netherlands 2020 based on my annual salary

        double annualSalary = 70000;
        double firstRange = 9.70 / 100;
        double secondRange = 37.35 / 100;
        double thirdRange = 49.50 / 100;
        double taxAmount;

        if (annualSalary <= 34712){
            annualSalary = annualSalary * firstRange;
        }else if (annualSalary >= 34713 && annualSalary <= 68507){
            annualSalary = annualSalary * secondRange;
        }else{
            annualSalary = annualSalary * thirdRange;
        }
        System.out.println(annualSalary);
    }
}
