/* prompt user to collect input.
   check using if and if else with else statement if the number and it square is greater than, or equal to, not equal to or less than 100.*/

import java.util.Scanner;
public class ComparingIntegers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int squaredNum = number * number;


		if(number > 100 ){
		System.out.println("Number greater than");
		}
 
		if(number < 100){
		System.out.println("Number equal to");
		}

		if(number == 100){
		System.out.println("Number is not equal to");
		}
 
		if(number != 100){
		System.out.println("Number is less than");
		
		}else{
			System.out.println("Nothing here");
		}


		if(squaredNum > 100 ){
		System.out.println("squaredNum greater than");
		}
 
		if(squaredNum < 100){
		System.out.println("squaredNum equal to");
		}

		if(squaredNum == 100){
		System.out.println("squaredNum is not equal to");
		}
 
		if(squaredNum != 100){
		System.out.println("squaredNum is less than");
		
		}else{
			System.out.println("Nothing here");
		}



	




	


	}

}
