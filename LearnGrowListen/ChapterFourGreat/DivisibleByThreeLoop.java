package ChapterFourGreat;

public class DivisibleByThreeLoop {
    public static void main(String[] args) {

        int sum = 0;
        for(int num = 1; num <= 30; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }


            sum += num;


        }
        System.out.println("The numbers are:" + sum);

    }
}
