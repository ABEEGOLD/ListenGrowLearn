package ChapterFourGreat.ARRAY;

public class SumOfSeries {
    public static void main(String[] args){

        System.out.printf("%-8s %-8s %-8s%n", "NUM1","NUM2","NUM3");

           for(int n = 1; n <= 100; n++){
              int num1 = n;
              int num2 = n * num1;
              int num3 = n * num2;


               System.out.printf("%-8d %-8d %-8d%n", num1, num2, num3);
           }

    }
}
