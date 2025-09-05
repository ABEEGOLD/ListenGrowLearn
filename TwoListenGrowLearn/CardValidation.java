import java.util.Scanner;
public class CardValidation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number == 3){
		System.out.println("Master Card");
		}else if(number == 2){
		System.out.println("American Express");
		}else if(number == 1){
		System.out.println("Visa Card");
		}else{
		System.out.println("invalid card number input");
		}
	}



}