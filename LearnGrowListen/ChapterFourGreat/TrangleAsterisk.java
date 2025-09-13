import java.util.Scanner;

public class TrangleAsterisk{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter the length of base triangle: ");
	int triangle = input.nextInt();

	for(int i = 0;i <= 10; i++){
		for(int j = 0; j<=i;j++){
			if(triangle == i && triangle == j){
			  System.out.println("*");
		
			}
			
			  
			}
	}
		
		System.out.println();
	
	 


  }
}