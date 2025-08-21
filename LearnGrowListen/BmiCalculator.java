import java.util.Scanner;
public class BmiCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in kilograms: ");
		int weight = input.nextInt();

		System.out.print("Enter your hieght in meters: ");
		int height = input.nextInt();

		double bmi = weight / height * height;
		System.out.printf("The body mass index is %.2f%n:",bmi);
		
		if(bmi < 18.5)System.out.println("UderWeight");
		if(bmi <= 24.9)System.out.println("Healthy");
		if(bmi >= 29.9)System.out.println("OverWeight");
		if(bmi >= 30.0)System.out.println("Obesity");


	}



}