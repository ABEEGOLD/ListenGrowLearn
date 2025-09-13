import java.util.Scanner;

public class LargestTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int largestOne = 0;
	int largestTwo = 0;
	int counter = 0;
	
	while(counter < 10){
	counter++;
	
	    System.out.print("Enter a number: ");
	    int number = input.nextInt();
	
	    if(number > largestOne){
		largestTwo = largestOne;
		largestOne = number;
	   }else if(number > largestTwo && number != largestOne){
		largestTwo = number;
		
           }
	}

	System.out.println("The largestOne:" +largestOne); 
	System.out.println("The largestTwo:" +largestTwo); 


   }
}