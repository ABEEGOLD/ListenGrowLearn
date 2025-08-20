/* prompt the user to collect input.
	initialize variables(diameter, circumference,area) and calculate using radius and PI.
	print result with floating point.*/
	



import java.util.Scanner;
public class FindRadiusOfCircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of a circle: ");
		int radius = input.nextInt();

		double diameter = 2 * radius;
		double circumference = 2 * 3.14159 * radius;
		double area = 3.14159 * radius * radius;

		System.out.printf("The diameter is %.2f%n:",diameter);
		System.out.printf("The circumference is %.2f%n:",circumference);
		System.out.printf("The area is %.2f%n:",area);


	}
}