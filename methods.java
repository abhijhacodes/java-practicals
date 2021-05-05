//Write a program to find largest of two numbers using method.

import java.util.*;

public class largestOf2 {
	
		private static int largest_of_two(int a, int b) {
			if (a > b)
				return a;
			else if (b > a)
				return b;
			else
				return -1;  // when they are equal
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter value of a: ");
			int a = sc.nextInt();
			System.out.print("Enter value of b: ");
			int b = sc.nextInt();
			int ans = largest_of_two(a,b);
			
			if (ans == -1)
				System.out.println("\nBoth numbers are equal.");
			else
			    System.out.printf("\nLargest number between %d and %d is %d\n", a, b, ans);
		}
}