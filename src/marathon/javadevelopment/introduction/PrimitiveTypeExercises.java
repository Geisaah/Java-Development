package marathon.javadevelopment.introduction;
/*  create variables for the fields described below between <> and the print the following menssage:

I <name>, living at the address <address>, I confirm that I received the salary < salary>, on the date <data>
*/


public class PrimitiveTypeExercises {
    public static void main(String[] args) {
        String name = "Maya";
        String address = "São Paulo";
        double salary = 5431.12;
        String dateReceivedSalary = "20/12/22";
        String report = "I " + name + " living at the address " + address + " I confirm that I received the salary " + salary + " on the date " + dateReceivedSalary + ".";
        System.out.println(report);

    }
}
