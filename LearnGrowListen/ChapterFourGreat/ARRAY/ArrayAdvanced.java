/**
 * Advanced Array Topics: Passing to Methods, Pitfalls
 * Key Concepts: Arrays are passed by reference, watch for modifications.
 * Easy Way: Methods can take array params, return new if needed.
 */

public class ArrayAdvanced {
    // Method to calculate sum (takes array as param)
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to double each element (modifies original)
    public static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Changes original array
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("Original values: " + java.util.Arrays.toString(values));

        // Example 1: Passing to method
        int total = calculateSum(values);
        System.out.println("Sum from method: " + total);

        // Example 2: Modifying via method (by reference)
        doubleElements(values);
        System.out.println("After doubling: " + java.util.Arrays.toString(values));

        // Example 3: Returning a new array from method
        int[] reversed = reverseArray(values);
        System.out.println("Reversed copy: " + java.util.Arrays.toString(reversed));

        // Example 4: Common Pitfall - Null arrays
        int[] nullArray = null;
        try {
            System.out.println(nullArray[0]); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("\nError: Can't access null array!");
        }

        // Example 5: Anonymous arrays
        int tempSum = calculateSum(new int[]{10, 20, 30}); // Create and pass inline
        System.out.println("Temp sum: " + tempSum);

        // Key Tip: Arrays are objects - passed by reference, so methods can change them.
        // To avoid changes, copy first with Arrays.copyOf().
    }

    // Helper method to reverse (returns new array)
    public static int[] reverseArray(int[] original) {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return reversed;
    }
}