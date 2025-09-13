/**
 * Accessing and Modifying Array Elements
 * Key Concept: Use indexes (starting from 0) to get or change values.
 * Easy Way: array[index] to read or write.
 * Remember: Index from 0 to length-1.
 */

import java.util.Arrays;

public class ArrayAccessModify {
    public static void main(String[] args) {
        // Example 1: Accessing elements (reading)
        int[] sales = {100, 200, 150, 300, 250};
        System.out.println("Sales array:");
        System.out.println("Total sales at index 0: " + sales[0]); // First sale
        System.out.println("Sales at index 2: " + sales[2]);       // Third sale
        System.out.println("Last sale (index 4): " + sales[4]);     // Use length-1 for last

        // Example 2: Modifying elements (changing values)
        sales[2] = 175; // Change third sale from 150 to 175
        System.out.println("\nAfter modifying index 2:");
        System.out.println("Updated sales: " + Arrays.toString(sales));

        // Example 3: Common pitfall - Index Out of Bounds
        try {
            int invalid = sales[5]; // Index 5 doesn't exist (length=5, max index=4)
            System.out.println("This won't print: " + invalid);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Index 5 is out of bounds! Max index is " + (sales.length - 1));
        }

        // Example 4: Looping to access and modify (e.g., add 10 to each score)
        int[] grades = {80, 85, 90, 75};
        System.out.println("\nOriginal grades: " + Arrays.toString(grades));
        for (int i = 0; i < grades.length; i++) {
            grades[i] += 5; // Add 5 to each grade (curve the scores)
        }
        System.out.println("Curved grades: " + Arrays.toString(grades));

        // Example 5: Accessing last element easily
        int lastIndex = grades.length - 1;
        System.out.println("Last grade (index " + lastIndex + "): " + grades[lastIndex]);

        // Key Tip: Always check bounds: if (index >= 0 && index < array.length)
    }
}