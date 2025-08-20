import java.util.Scanner;
public class LargestAndSmallest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		
		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();
		
		System.out.print("Enter fourth number: ");
		int fourthNumber = input.nextInt();

		System.out.print("Enter fifth number: ");
		int fifthNumber = input.nextInt();

		int smallest = firstNumber;
		int largest = firstNumber;

		if(secondNumber < smallest)smallest = secondNumber;
		if(thirdNumber < smallest)smallest = thirdNumber;
		if(fourthNumber < smallest)smallest = fourthNumber;
		if(fifthNumber < smallest)smallest = fifthNumber;
		

		if(secondNumber > largest)largest = secondNumber;
		if(thirdNumber > largest)largest = thirdNumber;
		if(fourthNumber > largest)largest = fourthNumber;
		if(fifthNumber > largest)largest = fifthNumber;

		System.out.println("The smallest number is:"+smallest);
		System.out.println("The largest number is:"+largest);

	}
}