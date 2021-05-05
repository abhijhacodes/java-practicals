/* Write a program which has two methods having name largest, 
first method should return largest of two numbers and second 
should return largest of three numbers passed as an arguments. Use concept of method overloading.*/

import java.util.*;

public class methodOverloading {
	   
	    // for two numbers
		private static int largest(int a, int b) {
			if (a > b)
				return a;
			else
				return b;
		}
        
        /* these two methods have same name and different arguments,
         this is method overloading in java */
        // for three numbers
		private static int largest(int p, int q, int r) {
            if (p > q && p > r)
            	return p;
            else if (q > p && q > r)
            	return q;
            else
            	return r;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("\n-----Largest of two numbers-----");
			System.out.print("Enter value of a: ");
			int a = sc.nextInt();
			System.out.print("Enter value of b: ");
			int b = sc.nextInt();
			int ans = largest(a,b);
			System.out.printf("\nLargest number between %d and %d is %d\n", a, b, ans);

			System.out.println("\n-----Largest of three numbers-----");
			System.out.print("Enter value of p: ");
			int p = sc.nextInt();
			System.out.print("Enter value of q: ");
			int q = sc.nextInt();
			System.out.print("Enter value of r: ");
			int r = sc.nextInt();
			int res = largest(p,q,r);
			System.out.printf("\nLargest number between %d, %d and %d is %d\n", p, q, r, res);

		}
}