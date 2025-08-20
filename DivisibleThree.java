import java.util.Scanner;
public class DivisibleThree{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int number = input.nextInt();

		if(number % 3 == 0){
			System.out.println("Number is divisible by three");
		}else{
			System.out.println("Number is not divisible");
		}


	}
}