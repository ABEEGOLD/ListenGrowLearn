import java.util.Scanner;
public class CollectScoreTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a score: ");
		int score = input.nextInt();



					if(score >= 70){
					System.out.println("Distinction");
					}
					else if(score >= 50){
					System.out.println("creadit");
					}
					else if(score >= 40){
					System.out.println("pass");
					}
					else{
					System.out.println("fail");
					}


	}
}

