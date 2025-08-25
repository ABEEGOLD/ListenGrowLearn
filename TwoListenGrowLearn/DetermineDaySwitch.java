import java.util.Scanner;
public class DetermineDaySwitch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 1 to 7: ");
		int day = input.nextInt();

		String dayName = input.nextLine();
		switch(day){

			case 1: 
			    dayName = "Sunday";
			    break;

			case 2: 
			    dayName = "Monday";
			    break;

			case 3: 
			    dayName = "Tuesday";
			    break;

			case 4: 
			    dayName = "Wednesday";
			    break;

			case 5: 
			    dayName = "Thursday";
			    break;

			case 6: 
			    dayName = "Friday";
			    break;

			case 7: 
			    dayName = "Saturday";
			    break;

			default: 
			    dayName = "Enter a valid day from 1 to 7(idiot)";
			    break;


			}

		System.out.println("Day " + day + " is: " + dayName);
		

	}



}