import java.util.Scanner;

public class SalesCommissionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salesCommission = 0.09;
        double grossSales = 0.0;
        int totalSales = 200;


        while(true){
            System.out.print("Enter your earnings (between 1 - 4)(use 0 to quit): ");
            double itemSold = input.nextDouble();
            if(itemSold  == 0){
                break;
            }
            if(itemSold  == 1){
                grossSales += 239.99;
            }else if(itemSold  == 2){
                grossSales += 129.75;
            }else if(itemSold  == 3){
                grossSales += 99.95;
            }else if(itemSold  == 4){
                grossSales += 350.89;
            }else{
                System.out.println("Invalid earnings!");
            }

        }
        double earnings = totalSales + (salesCommission * grossSales);
        System.out.println("Your earnings is: $" + earnings);
    }
}
