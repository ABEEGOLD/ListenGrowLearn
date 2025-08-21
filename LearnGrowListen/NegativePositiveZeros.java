
import java.util.Scanner;
public class NegativePositiveZeros{
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
		
		int negativeNumber = 0;
		int positiveNumber = 0;
		int zeros = 0;

		if(firstNumber > 0){
		positiveNumber +=1;
		}else if(firstNumber < 0){
		negativeNumber += 1;
		}else{
			zeros += 1;
		} 

		
		if(secondNumber > 0){
		positiveNumber +=1;
		}else if(secondNumber < 0){
		negativeNumber += 1;
		}else{
			zeros += 1;
		} 
		
		
		if(thirdNumber > 0){
		positiveNumber +=1;
		}else if(thirdNumber < 0){
		negativeNumber += 1;
		}else{
			zeros += 1;
		} 
		
		
		if(fourthNumber > 0){
		positiveNumber +=1;
		}else if(fourthNumber < 0){
		negativeNumber += 1;
		}else{
			zeros += 1;
		} 
		
		
		if(fifthNumber > 0){
		positiveNumber +=1;
		}else if(fifthNumber < 0){
		negativeNumber += 1;
		}else{
			zeros += 1;
		} 

		System.out.println("The Positive number is:"+positiveNumber);
		System.out.println("The negative number is:"+negativeNumber);
		System.out.println("The zero number is:"+zeros);


	}



}