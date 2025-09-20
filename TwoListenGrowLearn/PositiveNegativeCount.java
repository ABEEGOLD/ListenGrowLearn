import java.util.Scanner;
public class PositiveNegativeCount {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an integer(use -1 to quit): ");
            int number = input.nextInt();

            int positiveCount = 0;
            int negativeCount = 0;
            double total = 0;
            double average = 0;
            int calculate = 0;
            int counter  = 1;

            while (counter != 0) {
                counter++;
                System.out.print("Enter an integer(use 0 to quit): ");
                number = input.nextInt();
                if (number == 0) {
                    break;
                }

                if (number > 0) {
                    positiveCount += 1;

                }
                if (number < 0) {
                    negativeCount += 1;

                }

                if (positiveCount != 0 && negativeCount != 0) {
                    calculate = positiveCount + negativeCount;
                }

            }
                total += counter;
                average = total /calculate ;


            System.out.println("The positive count is: " + positiveCount);
            System.out.println("The negative count is: " + negativeCount);
            System.out.printf("The total is: %.2f%n", total);
            System.out.printf("The average is: %.2f%n", + average);
    }

}


