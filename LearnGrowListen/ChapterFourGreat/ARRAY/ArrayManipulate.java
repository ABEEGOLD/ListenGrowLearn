/**
 * Common Array Manipulations
 * Key Concepts: Sorting, searching, copying, resizing.
 * Easy Way: Use java.util.Arrays class methods.
 */

import java.util.Arrays;

public class ArrayManipulate {
    public static void main(String[] args) {
        int[] data = {50, 20, 40, 10, 30};
        System.out.println("Original data: " + Arrays.toString(data));

        // Example 1: Sorting an array
        Arrays.sort(data); // Sorts in ascending order
        System.out.println("Sorted data: " + Arrays.toString(data));

        // Example 2: Searching for an element (must be sorted first)
        int index = Arrays.binarySearch(data, 30); // Returns index if found
        if (index >= 0) {
            System.out.println("30 found at index: " + index);
        } else {
            System.out.println("30 not found.");
        }

        // Example 3: Copying an array
        int[] copy = Arrays.copyOf(data, data.length); // Shallow copy
        System.out.println("Copy: " + Arrays.toString(copy));

        // Example 4: Filling an array with a value
        int[] filled = new int[5];
        Arrays.fill(filled, 100); // All elements become 100
        System.out.println("Filled array: " + Arrays.toString(filled));

        // Example 5: "Resizing" (create new array and copy)
        // Arrays are fixed, so to add: create larger one
        int[] larger = Arrays.copyOf(data, data.length + 1);
        larger[data.length] = 60; // Add new element
        System.out.println("Resized and added 60: " + Arrays.toString(larger));

        // Example 6: Comparing arrays
        boolean same = Arrays.equals(data, copy);
        System.out.println("Original equals copy? " + same);

        // Key Tip: Import java.util.Arrays; for these helpers.
        // For dynamic resizing, consider ArrayList later.
    }
}