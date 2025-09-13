import java.util.Arrays;

public class CheckIndex{
	public static void main(String[] args){

int[] numbers = {2, 5, 7, 11, 49};
boolean[] status = perfectSquare(numbers);


System.out.println(Arrays.toString(status));

}


  public static boolean[] perfectSquare(int[] array) {
    boolean[] booleanSquare = new boolean[array.length];
    	
    for (int index = 0; index < array.length; index++) {
	int possibleRoot = (int)Math.sqrt(array[index]);
		if(array[index] % possibleRoot == 0){
			booleanSquare[index] = true;
		}else{
			booleanSquare[index] = false;
		}
     
    }
    return booleanSquare;
   
}


}
