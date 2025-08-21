import java.util.Scanner;
public class TaskSeven{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number % 2 == 0){
			number *= 2;
		}else{
			number -= 1;
		}

		System.out.println(number);
	


	}



}