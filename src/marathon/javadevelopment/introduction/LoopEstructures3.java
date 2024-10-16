package marathon.javadevelopment.introduction;

public class LoopEstructures3 {
    public static void main(String[] args) {
        //GIVEN THE VALUE OF A CAR, FIND OUT HOW MANY INSTALLMENTS IT CAN BE PAID IN
        //CONDITIONAL INSTALLMENT AMOUNT>= 1000
        double totalAmount = 30000;
        for (int installment = 1; installment <= totalAmount ; installment++) {
            double installmentAmount = totalAmount / installment;
            if (installmentAmount >= 1000){
                System.out.println("installment " + installment+ " R$ " + installmentAmount);
            }else{
                break;
            }
            System.out.println("outside the if but inside the for " +installment);
        }
    }
}
