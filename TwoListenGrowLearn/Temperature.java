import java.util.Scanner;
public class Temperature{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature(not less than or -273): ");
		int temp = input.nextInt();
		int count = 0;
		if(temp <-273){
		System.out.println("Enter the temperature not less than or -273");
		}
		
	while(count <= 5){
	count++;
			
		temp += 1;
		double fahrenheit =  (double)(temp * 0.55)+ 32;
		System.out.println(temp);
		System.out.printf("The convertion fahrenheit is %.2f%n:",fahrenheit); 

	
		}
				



}


}