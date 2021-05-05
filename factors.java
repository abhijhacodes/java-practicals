/* Write a program that reads an integer and displays all its smallest factors in increasing order. 
For example if input number is 120, the output should be as follows:2,2,2,3,5. */

import java.util.*;

public class factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----To display factors of a number in increasing order----");
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		// input validation
        if (n < 0) {       
        	System.out.println("Please enter a non-negative number !");
        	System.exit(0);
        }

		System.out.printf("factors of the number %d in increasing order are: ",n);
		int div = 2;
		while (n > 1) {
			if (n % div == 0) {
				System.out.print(div + ", ");
				n /= div;
			}
			else
				div++;
		}
		System.out.print("\n");
	}
}