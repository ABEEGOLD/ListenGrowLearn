import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	//System.out.print("Enter your name: ");
	//String name = input.nextLine();
			
		int largest = 0;
		//int smallest = 0;
		int counter = 1;
 	while(counter <= 9){
	counter++;
	System.out.print("Enter a number: ");
		int number = input.nextInt();
		
	if(number > largest){
		largest = number;
	}
	
	/*if(number < smallest){
		smallest = number;
	}*/
	}
	//System.out.println("Miss:" +name);
	System.out.println("Count is:" +counter);
	System.out.println("The largest number is:"+largest);
	//System.out.println("The smallest number is:"+smallest);

   

   }
}