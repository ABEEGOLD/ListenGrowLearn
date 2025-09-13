//import java.util.Arrays;
//
//public class SecondSqareSize {

//    public static boolean[] areLeftAndRightColumnsEqual(int[][] matrix) {
//        int sum = 0;
//        int sum2 = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            sum += matrix[i][0];
//
//            sum2 += matrix[i][matrix[i].length - 1];
//            if (sum == sum2){
//
//
//                return new boolean[]{true};
//            }
//        }
//        return new boolean[]{false};
//    }
//    public static void main(String[] args) {
//        int[][] matrix = {{4,5,5},
//                {5,2,3},
//                {3,5,2}};
//        System.out.print(Arrays.toString(second.areLeftAndRightColumnsEqual(matrix)));
//    }
//
//}