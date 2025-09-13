/**
 * Array Declaration and Initialization in Java
 * Key Concept: How to create and set up arrays.
 * Arrays are fixed-size collections of the same type.
 * Easy Way: Use {} for initialization or new keyword.
 */

public class ArrayDeclarationInitialization {
    public static void main(String[] args) {
        // Example 1: Declaring an array of integers (scores)
        // Declaration: Tells Java what type and name, but no size yet
        int[] scores;
        
        // Initialization: Give it a size (e.g., for 5 students)
        scores = new int[5];
        
        // Now fill it with default values (0 for ints)
        System.out.println("Newly declared scores array (defaults to 0):");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
        }

        // Example 2: Declare and initialize in one line with values
        // This is the easiest way for known values
        int[] temperatures = {72, 75, 68, 70, 73}; // Weekly temps
        System.out.println("\nInitialized temperatures array:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + " (index " + i + "): " + temperatures[i] + "°F");
        }

        // Example 3: Array of doubles (prices)
        double[] prices = new double[4]; // Empty array of size 4
        prices[0] = 10.99; // Set first price
        prices[1] = 25.50;
        prices[2] = 15.75;
        prices[3] = 8.25;
        System.out.println("\nFilled prices array:");
        for (double price : prices) { // Enhanced for loop to print
            System.out.printf("Price: $%.2f\n", price);
        }

        // Example 4: Multi-line initialization for clarity
        String[] fruits = {
            "Apple",  // Index 0
            "Banana", // Index 1
            "Cherry"  // Index 2
        };
        System.out.println("\nFruits array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }

        // Key Tip: Arrays have fixed size - can't change after creation!
        // Use ArrayList for dynamic sizes (but that's for later).
    }
}