package marathon.javadevelopment.introduction;

public class LoopEstructures4 {
    public static void main(String[] args) {
        double TotalAmount = 30000;
        for (int installment = (int) TotalAmount; installment >= 1; installment--){
            double installmentAmount = TotalAmount / installment;
            if(installmentAmount < 1000){
                continue;
            }
            System.out.println("installment " + installment + " R$ " + installmentAmount);
        }
    }
}
