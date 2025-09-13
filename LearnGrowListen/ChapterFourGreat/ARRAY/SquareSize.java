import java.util.Arrays;
public class SquareSize{
	public static void main(String[] args){
		int[][] squareArray ={ 
					{4, 5,5},
					{5,2,3},
					{3,5,2}};
		boolean arrays = perfectSquare(squareArray);
	System.out.println("The perfect square is: " +(arrays));

	}

public static boolean perfectSquare(int[][] array){

		int sideA = array[0][0] + array[1][0] + array[2][0];
		int sideB = array[0][0] + array[0][1] +array[0][2];
				
		if(sideA == sideB){
			
			return true;

		}else{
			return false;
		}

	
}	




 


}