import java.util.Scanner;
public class CardValidator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		String card = "";

		switch(number){
			
			case 3:
				card = "Master card";
				break;

			case 2:
				card = "American Express";
				break;

			case 1:
				card = "Visa card";
				break;

			default:
				card = "invalid card input";
				break;


		}
		System.out.println(card);	




	}



}