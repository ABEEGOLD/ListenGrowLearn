/**
 * 2D Arrays (Multi-dimensional)
 * Key Concept: Arrays of arrays, like a table (rows and columns).
 * Easy Way: Use [row][col] to access, nested loops to process.
 */

public class Array2D {
    public static void main(String[] args) {
        // Example 1: Declare and initialize 2D array (3x3 matrix of scores)
        int[][] scoresMatrix = {
            {85, 90, 78},  // Row 0
            {92, 88, 95},  // Row 1
            {76, 82, 80}   // Row 2
        };
        System.out.println("2D Scores Matrix:");

        // Nested loops to print
        for (int row = 0; row < scoresMatrix.length; row++) {
            for (int col = 0; col < scoresMatrix[row].length; col++) {
                System.out.print(scoresMatrix[row][col] + "\t");
            }
            System.out.println(); // New line per row
        }

        // Example 2: Accessing specific element
        System.out.println("\nStudent 2's first test (row 1, col 0): " + scoresMatrix[1][0]);

        // Example 3: Modifying an element
        scoresMatrix[2][1] = 85; // Change row 2, col 1 from 82 to 85
        System.out.println("\nAfter update:");
        for (int[] row : scoresMatrix) { // Enhanced for rows
            for (int score : row) {
                System.out.print(score + "\t");
            }
            System.out.println();
        }

        // Example 4: Sum all elements (total scores)
        int total = 0;
        for (int row = 0; row < scoresMatrix.length; row++) {
            for (int col = 0; col < scoresMatrix[row].length; col++) {
                total += scoresMatrix[row][col];
            }
        }
        System.out.println("Total scores: " + total);

        // Example 5: Jagged array (rows can have different lengths)
        int[][] jagged = {
            {1, 2},     // Row 0: 2 elements
            {3, 4, 5},  // Row 1: 3 elements
            {6}         // Row 2: 1 element
        };
        System.out.println("\nJagged array:");
        for (int[] row : jagged) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Key Tip: Rows may vary in length, but always check with array[row].length
    }
}