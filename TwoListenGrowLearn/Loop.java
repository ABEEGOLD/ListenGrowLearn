import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//
//        int sum = 0, i = 1;
//        while(i  <  10){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("sum is:"+sum);

        //public class RepeatAdditionQuiz
//        int number1 = (int)(Math.random() * 20);
//        int number2 = (int)(Math.random() * 20);
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("What is: " + number1 + " + " + number2 + "?: ");
//        int answer = input.nextInt();
//
//        while(number1 + number2 != answer) {
//            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
//            answer = input.nextInt();
//
//        }
//        System.out.println("You got it!");

        //the following code for computing
        double item = 1;
        double sum = 0;
        while (item != 0) { // No guarantee item will be 0
            sum += item;
            item -= 0.1;
            item++;
        }
        System.out.println(sum);

    }
}
