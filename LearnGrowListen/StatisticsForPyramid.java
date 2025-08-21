import java.util.Scanner;
public class StatisticsForPyramid{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the estimated number of stones: ");
		int numberOfStones = input.nextInt();

		System.out.print("Enter the average weight of each stone: ");
		double averageWeightStone = input.nextDouble();

		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();

		double weightUsed = (double) averageWeightStone * numberOfStones ;
		
		int estimateYear = numberOfYears * 365; 
		int estimateHour = estimateYear * 24;
		int estimateMinute = estimateHour * 60;

		System.out.println("The estimated years weight is:" +estimateYear);
		System.out.println("The estimated hour weight is:" +estimateHour);
		System.out.println("The estimated minute weight is:" +estimateMinute);






}




}