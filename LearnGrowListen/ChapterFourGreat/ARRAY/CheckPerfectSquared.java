import java.util.Arrays;

public class CheckPerfectSquared{
	public static void main(String[] args){

int[] numbers = {2, 4, 8, 25, 49};
boolean[] status = perfectSquare(numbers);


System.out.println(Arrays.toString(status));

}


  public static boolean[]  perfectSquare(int[] array) {
    boolean[] result = new boolean[array.length];
	    
    for (int i = 0; i < array.length; i++) { 
        if(array[i] == Math.sqrt(array[i])){
		return new boolean[]{true};	
	}
	
    }
    
    return new boolean[]{false};
}


}
