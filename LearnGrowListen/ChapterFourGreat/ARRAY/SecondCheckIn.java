import java.util.Arrays;

public class SecondCheckIn {
    public static boolean[] perfectSquaresArray(int[] arr) {
        boolean[] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num < 0) {
                result[i] = false;
                continue;
            }
            int sqrt = (int) Math.sqrt(num);
            result[i] = (sqrt * sqrt == num);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = {1,2,3,4,5,6,7,8,9,16,48,91};
        System.out.print(Arrays.toString(perfectSquaresArray(result)));

    }
}