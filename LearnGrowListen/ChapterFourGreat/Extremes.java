package ChapterFourGreat;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your input values for numbers:");
        int userNumber = sc.nextInt();

        System.out.print("Enter only input values asked(count 1):");
        int inputValue = sc.nextInt();
        int minimum = inputValue;
        int maximum = inputValue;

        int count = 1;
        while(count < userNumber) {
            System.out.print("Enter only input values asked:");
             inputValue = sc.nextInt();


            if (inputValue < minimum) {
                minimum = inputValue;
            }
            if (inputValue > maximum) {
                maximum = inputValue;
            }
            count++;
        }
        int sum = minimum + maximum;


        System.out.println("The minimum number is: " + minimum);
        System.out.println("The maximum number is: " + maximum);
        System.out.println("The sum number is: " + sum);

    }
}
