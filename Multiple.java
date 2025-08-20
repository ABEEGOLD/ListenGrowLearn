import java.util.Scanner;
public class Multiple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();
		
		 int  tripleFirst = firstNumber * 3;
		 int  doubleSecond  = secondNumber * 2;
		
		if(doubleSecond == 0){
		System.out.println("Cannot divide by zero");

		}else if(tripleFirst % doubleSecond == 0){
		System.out.println("\nNumber triple:" +tripleFirst+ "\nis a multiple:" +doubleSecond);
		}else{
			System.out.println("\nnumber triple:" +tripleFirst+ "\nis not a multiple of:" +doubleSecond); 
		}
		
		
	}				
}