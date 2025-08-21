import java.util.Scanner;
public class WorldPopulationGrowth{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter current world population:");
		int currentWorldPopulation = input.nextInt();

		System.out.println("Enter annual growth rate: ");
		double worldGrowthRate = input.nextDouble();
		
				double growthRate = worldGrowthRate / 100;
				
	
		int estimatedYearOne = currentWorldPopulation +(int)(currentWorldPopulation * growthRate);
		int estimatedYearTwo =  estimatedYearOne +(int)(estimatedYearOne * growthRate);
		int estimatedYearThree = estimatedYearTwo +(int)(estimatedYearTwo * growthRate);
		int estimatedYearFour =  estimatedYearThree +(int)(estimatedYearThree * growthRate);
		int estimatedYearFive = estimatedYearFour +(int)(estimatedYearFour * growthRate);
		
		System.out.println("Etimated growth for one year is:"+estimatedYearOne);
		System.out.println("Etimated growth for two years is:"+estimatedYearTwo);
		System.out.println("Etimated growth for Three years is:"+estimatedYearThree);
		System.out.println("Etimated growth for Four years is:"+estimatedYearFour);
		System.out.println("Etimated growth for Five years is:"+estimatedYearFive);	
	
	}


}




//8,208,709,800