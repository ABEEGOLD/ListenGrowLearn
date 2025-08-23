 import java.util.Scanner;
public class ValidateGender{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if(age <= 12){
			System.out.println("Your a Child");

		}else if(age >= 13 && age <= 19){
			System.out.println("Your a teenager");
		}else{
			System.out.println("Your an adult");
		}


	


}



}