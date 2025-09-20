import java.util.Scanner;

public class RepeatAddition {
    public static void main(String[] args) {
        final int NUMBER_OF_SUBTRACTIONS = 5;
        final int NUMBER_OF_ADDITIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        String output1 = "";
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_SUBTRACTIONS) {
            int number1 = (int) (Math.random() * 15);
            int number2 = (int) (Math.random() * 15);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is;  " + number1 + "-" + number2 + "?: ");
            int answer1 = input.nextInt();

            if (number1 - number2 == answer1) {
                System.out.println("You are correct");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + "-" + number2 + "  should be: " + (number1 - number2));

            count++;

            output += "\n" + number1 + "_"  +  number2  +  " = "  +   answer1   + (((number1 - number2) == answer1) ? " correct " : " wrong ");

        }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("correct count is " + correctCount + "\nTest time is " +testTime / 1000 + " seconds\n" + output);

        int correctCount1 = 0;
        int count2 = 0;

        while(count2 < NUMBER_OF_ADDITIONS) {
            int number2 = (int) (Math.random() * 15);
            int number3 = (int) (Math.random() * 15);

            if (number2 < number3) {
                int temp2 = number2;
                number2 = number3;
                number3 = temp2;
            }
            System.out.print("What is: " + number2 + "+" + number3 + "?: ");
            int answer2 = input.nextInt();

            if (number2 + number3 == answer2) {
                System.out.println("You are correct");
                correctCount1++;
            }
            else
                System.out.println("You are wrong.\n"  +   number2 +  "+"  +   number3   + "  should be: " + (number2 + number3));
            count2++;


            output1 += "\n" + number2 + "+" +   number3   + " = " +  answer2  + (((number2 + number3) == answer2) ? "  correct  " : "  wrong  ");
        }

        long endTime2 = System.currentTimeMillis();
        long testTime2 = endTime2 - startTime;

        System.out.println("correct count is " + correctCount1 + "\nTest time is " +testTime2 / 1000 + " seconds\n" + output1);

    }
}











// (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
//subtraction questions. Revise the program to generate ten random addition ques
//tions for two integers between 1 and 15. Display the correct count and test time.