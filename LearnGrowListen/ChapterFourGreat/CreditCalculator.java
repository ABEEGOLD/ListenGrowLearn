import java.util.Scanner;
public class CreditCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your account number: ");
		int accountNumber = input.nextInt();
		System.out.print("Enter your beginning balance: ");
		int beginBalance = input.nextInt();
		System.out.print("Enter your item charged: ");
		int totalItemCharged = input.nextInt();
		System.out.print("Enter your credit: ");
		int Credit = input.nextInt();
		System.out.print("Enter your credit limit: ");
		int creditLimit = input.nextInt();

		int newBalance = beginBalance + totalItemCharged - Credit;
		
		System.out.println("The new balance is: " + newBalance + "\ttoday");

		if(newBalance > creditLimit){
		System.out.println("Credit limit exceeded");
		}else{
			System.out.println("good credit limit");
		}



	} 
}