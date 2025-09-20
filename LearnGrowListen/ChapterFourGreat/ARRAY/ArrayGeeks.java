package ChapterFourGreat.ARRAY;

import java.util.Arrays;

public class ArrayGeeks {
    public static void main(String[] args) {
        int[] arrayKey = {0,2,0,3,4};
        ArrayGeeks.sortArray((arrayKey));
        System.out.println(Arrays.toString(arrayKey));

    }
        public static int[] sortArray(int[] arr){
            int count_0 = 0;
            int count_1 = 0;
            int count_2 = 0;

            for (int index = arr.length -1;index >= 0; index--) {
                if (arr[index] == 0) {
                    count_0++;
                } else if (arr[index] == 1) {
                    count_1++;
                } else {
                    count_2++;
                }


            }
            return arr;
//            int i = 0;
//            for (i = 0; i < count_0; i++) {
//                arr[i] = 0;
//            }
//            for (i = count_0; i < count_0 + count_1; i++) {
//                arr[i] = 1;
//            }
//            for (i = count_0 + count_1; i < arr.length; i++) {
//                arr[i] = 2;
//            }

        }


}
