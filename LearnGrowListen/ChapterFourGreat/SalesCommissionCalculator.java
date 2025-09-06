import java.util.Scanner;
public class SalesCommissionCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double grossSales = 0.0;
		double commission = 0.09;
		double totalPay = 200.0;
		
	  while(true){

		  System.out.print("Enter item sold 1-4(or enter -1 to quit): ");
		  int itemSold = input.nextInt();
			if(itemSold == -1){
				break;
			}
		 if(itemSold == 1){
			grossSales += 239.99;
		 }else if(itemSold == 2){
			grossSales += 129.75;
		 }else if(itemSold == 3){
			grossSales += 99.95;
		 }else if(itemSold == 4){
			grossSales += 350.89;
		 }else{
			System.out.println("Enter a valid item number (1-4)");
		 }
					
	  }

		 
		 double earnings =  totalPay + (commission * grossSales);
		 System.out.printf("The person earnings is:%.3f%n", earnings);



      }
}	