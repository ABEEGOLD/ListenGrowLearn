import java.util.Scanner;
public class DetermineLeapYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int year = input.nextInt();

		if(year % 4 == 0 &&(year % 100 != 0 || year % 400 == 0)){
		System.out.println(year + " The Year input is a Leap Year");
		}else{ 
		
		System.out.println(year + " The Year input is Not a  Leap Year");
		}

	}



}