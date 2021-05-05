
/* Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , 
display the matrix, check every raw and column have an odd number’s of 1’s. */

import java.util.*;

public class matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n6 by 6 two dimensional matrix having all elements as 0 or 1");

        // 2 dimensional 6*6 matrix
        int matrix[][] = new int[6][6];

        // filling all elements in matrix as 0 or 1
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 5 % 2);
            }
        }

        // displaying the matrix
        System.out.println("\nElements in 2d matrix are:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int row, col, count;

        // we will traverse all rows one by one and increase the count for every row having odd number of 1's
        System.out.println("\nThe rows having odd number of 1s are:");
        for (row = 0; row < 6; row++) {
        	count = 0;  // making count=0 for every row
        	for (col = 0; col < 6; col++) {
        		if (matrix[row][col] == 1) {
        			count++;
        		}
        	}
        	if (count % 2 != 0)
        		System.out.println("Row " + (row+1) + " have " + count + " (odd) number of 1's.");
        }

        // applied the same logic on columns as did for the rows
        System.out.println("\nThe columns having odd number of 1s are:");
        for (col = 0; col < 6; col++) {
        	count = 0;  // making count=0 for every column
        	for (row = 0; row < 6; row++) {
        		if (matrix[row][col] == 1) {
        			count++;
        		}
        	}
        	if (count % 2 != 0)
        		System.out.println("Column " + (col+1) + " have " + count + " (odd) number of 1's.");
        }
        
    }
}
