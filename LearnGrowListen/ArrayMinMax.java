import java.util.Arrays;
 
public class ArrayMinMax{
	public static void main(String[] args){

	int [] numbers = {13 , 45, 30, 60,90,10};
		int min = numbers[0];
		int max = numbers[0];
	
		for(int i = 0; i< numbers.length; i++){
			
			if(numbers[i] < min){
				min = numbers[i];
			}
			
			else{
				max = numbers[i];
			}
		}
	
			System.out.println("The min number is:"+min);
			System.out.println("The max number is:"+max);


	}



}