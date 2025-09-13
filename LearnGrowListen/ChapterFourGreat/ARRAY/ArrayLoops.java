/**
 * Looping Through Arrays
 * Key Concept: Use loops to process all elements.
 * Easy Ways: Traditional for loop with index, or enhanced for-each loop.
 */

public class ArrayLoops {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Numbers array: " + java.util.Arrays.toString(numbers));

        // Example 1: Traditional for loop (when you need index)
        System.out.println("\nUsing traditional for loop:");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add each number
            System.out.println("Index " + i + ": " + numbers[i] + ", Running sum: " + sum);
        }
        System.out.println("Total sum: " + sum);

        // Example 2: Enhanced for-each loop (easy for reading all elements, no index needed)
        System.out.println("\nUsing enhanced for-each loop:");
        double average = 0;
        for (int num : numbers) { // 'num' is each element
            average += num; // Add to sum
            System.out.println("Number: " + num);
        }
        average /= numbers.length;
        System.out.printf("Average: %.2f\n", average);

        // Example 3: Loop to find max value
        int max = numbers[0]; // Start with first
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("\nMax value: " + max);

        // Example 4: Loop with condition (e.g., print even numbers)
        System.out.println("\nEven numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // Key Tip: For-each is simpler but can't change elements or need index.
        // Use traditional when you need to modify or know position.
    }
}