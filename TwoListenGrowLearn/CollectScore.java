import java.util.Scanner;
public class CollectScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a score: ");
		String score = input.next();



					if(score.equalsIgnoreCase("40")){
					System.out.println("Fail");
					}

					if(score.equalsIgnoreCase("50")){
					System.out.println("Pass");
					}

					if(score.equalsIgnoreCase("60")){
					System.out.println("Credit");
					}
					
					if(score.equalsIgnoreCase("70")){
					System.out.println("Distinction");
					}else{
						System.out.println("perfect");
					}


	}
}

