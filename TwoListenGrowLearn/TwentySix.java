import java.util.Scanner;
public class TwentySix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int smallest = 9;
			
			while(number > 0){
				int digit = number % 10;
				if(digit < smallest){
			   		smallest = digit; 							}
				number = number / 10;

			}
			System.out.println("The smallest digit: "+smallest);
		
		
	}
}