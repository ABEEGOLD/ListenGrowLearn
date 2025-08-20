/* prompt user to collect input for three integers.
	calculate the sum,average,product,smallest,and largest.
		print result.*/
import java.util.Scanner;
public class ArithmeticSmallestLargest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter the third number: ");
		int thirdNumber = input.nextInt();

		int sum = firstNumber + secondNumber + thirdNumber;
		
		int average = sum / 3;

		int product  = firstNumber * secondNumber * thirdNumber;
		
		int smallest = firstNumber;
		int largest = firstNumber;
		
		
		if(secondNumber < smallest){
		smallest = secondNumber;
		}
 
		if(thirdNumber < smallest){
		smallest = thirdNumber;
		} 

				
		if(secondNumber > largest){
		largest = secondNumber;
		}

		if(thirdNumber >= largest){
		largest = thirdNumber;
		}

		System.out.println("The sum of number is:"+sum);
		System.out.println("The Average is:"+average);
		System.out.println("The Product is:"+product);
		System.out.println("The smallest number is:"+smallest);
		System.out.println("The largest number is:"+largest);






	}

}
		