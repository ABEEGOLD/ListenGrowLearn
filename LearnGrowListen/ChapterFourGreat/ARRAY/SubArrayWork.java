package ChapterFourGreat.ARRAY;
import java.util.Arrays;
public class SubArrayWork {
    public static void main(String[] args){
            int[] arrayValue = {1,2,4,5,6,7,8,9};
            int target = 32;
            int[] result = subArray(arrayValue,target);
            System.out.println(Arrays.toString(result));
    }
        public static int[] subArray(int[] arr, int target){
            int targetIn = 0;
            int sum = 0;
            for(int index = 0; index < arr.length; index++){
                sum += arr[index];

               while(sum > target  && targetIn <= index){
                    sum -= arr[targetIn];
                    targetIn++;
                }
                if(target == sum){
                    return new int[]{targetIn + 1, index + 1};
                }

            }

            return new int[]{- 1,- 1};
        }
}


