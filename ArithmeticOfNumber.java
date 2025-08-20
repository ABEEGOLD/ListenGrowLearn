/*prompt user to enter two numbers that is int.
	add the numbers and  give a square of each.
	the sum of  their square and their difference. which is minus the number from each other.*/

import java.util.Scanner;
public class ArithmeticOfNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter firstNumber:");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		int squaredFirstNum = firstNumber * firstNumber;
		int squaredSecondNum = secondNumber * secondNumber;

		int sum = squaredFirstNum + squaredSecondNum;
		
		int difference = squaredFirstNum - squaredSecondNum;

		System.out.println("The first number square is:"+squaredFirstNum);
		System.out.println("The first second square is:"+squaredSecondNum); 
		System.out.println("Their square sum is:"+sum); 				System.out.println("Their difference is:"+difference);  		
		

	}
}