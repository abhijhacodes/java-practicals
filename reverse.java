/*Write a test program that prompts the user to enter ten numbers, 
invoke a method to reverse the numbers, display the numbers.*/

import java.util.*;

class reverse {
    
    /* this method will store the array elements in a new array
    in reverse order and then will display the new array,
     i.e. we will get the numbers in reverse order, but there
     will be no change in original array */

	static void reverse(int ar[], int n) {
        int b[] = new int[n];
        int j = n;
        for (int i=0; i<n; i++) {
        	b[j-1] = ar[i];
        	j--;
        }

        // printing the new(reversed) array
        System.out.println("\nThe numbers in reverse order are: ");
        for (j=0; j<n; j++) {
        	System.out.print(b[j] + " ");
        } 
        System.out.print("\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter array length: ");
		int n = sc.nextInt();
        // input validation
        if (n < 0) {       
        	System.out.println("\nPlease enter valid(non-negative) array length!");
        	System.exit(0);
        }

        // array declaration
		int ar[] = new int[n];

		// taking input for array
		System.out.printf("\nEnter %d elements: \n",n);
		for (int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}

		// calling the reverse method 
        reverse(ar, n);  
	}
}