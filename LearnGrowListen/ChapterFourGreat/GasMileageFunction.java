import java.util.Scanner;
public class GasMileageFunction{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int totalMile = 0;
		int totalGallon = 0;

	while(true){
		System.out.print("Enter miles(or use -1 to quit): ");
		  int miles = input.nextInt();
		if(miles == -1){
			break;
		}

	    System.out.print("Enter gallon(or use -1 to quit):");
		int gallons = input.nextInt();
			if(gallons == -1){
				break;
			}

	double mpg = gasMilage(miles,gallons);
System.out.printf("miles per gallon during this trip is: %.2f%n",mpg);

		totalMile += miles;
		totalGallon += gallons;
	} 

	if(totalGallon != 0){
	double combineMpg = gasMilage(totalMile,totalGallon);
	System.out.printf("Combine miles gallon trip is: %.2f%n",combineMpg);
}else{
	System.out.println("No valid put was entered.");
} 


}

public static double gasMilage(int miles, int gallons){
	return (double) miles / gallons;
		

}

	



}







