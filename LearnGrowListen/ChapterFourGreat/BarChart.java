package ChapterFourGreat;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int[] numbers = new int[5];


                for (int i = 0; i < numbers.length; i++) {
                    int num;
                    do {
                        System.out.print("Enter number " + (i + 1) + " (between 1 and 30): ");
                        num = scanner.nextInt();
                        if (num < 1 || num > 30) {
                            System.out.println(" Number must be between 1 and 30. Try again.");
                        }
                    } while (num < 1 || num > 30);

                    numbers[i] = num;
                }


                System.out.println("\nBar Chart:");
                for (int num : numbers) {
                    for (int i = 0; i < num; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }


            }
        }



