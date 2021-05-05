// Write a program to find the factorial of given number. Take number through command line argument.

import java.util.*;

public class factorial {

	private static int factorial(int n) {
        if(n == 1 || n == 0)
        	return 1;  // recursion base case
        else
        	return n*(factorial(n-1));
        
        /* here i have already constrained the input condition so that we cannot input
         a negative number hence there is no need to check for any other condition */
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number to calculate factorial: ");
		int n = sc.nextInt();

		// input validation
		if (n < 0) {
			System.out.println("\nPlease enter a non-negative number!");
			System.exit(0);
		}

		int ans = factorial(n);
		System.out.printf("Factorial of %d = %d\n", n, ans);
	}
}