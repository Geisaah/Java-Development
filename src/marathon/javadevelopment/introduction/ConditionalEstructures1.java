package marathon.javadevelopment.introduction;

public class ConditionalEstructures1 {
    public static void main(String[] args) {
        // age < 25 kids category
        // age >= 15 && age < 18 youth category
        // age >= 18  adult category
        int age = 45;
        if(age < 15){
            System.out.println("kids category");
        }else if (age >= 15 && age < 18){
            System.out.println("youth category");
        }else if (age >= 18){
            System.out.println("adult category");


            //
            int idade = 12;
            String categoria;

            if(idade <15) {
                categoria = "categoria infantil";
            }else if(idade >= 15 && idade < 18) {
                categoria = "categoria juvenil";
            }else {
                categoria = "categoria adulto";
            }
            System.out.println(categoria);

            }
        }
    }
}
