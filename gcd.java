/*Write a method with following method header. public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.*/

import java.util.*;

public class gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n------Calculating gcd of two numbers------");
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
         
        // input validation
        if (num1 < 0 || num2 < 0) {       
        	System.out.println("Negative numbers are not allowed, please enter valid numbers.");
        	System.exit(0);
        }

        int gcd = gcd(num1, num2);  // method call
        System.out.printf("gcd of %d and %d is = %d\n", num1, num2, gcd);
	}
	// gcd method definition
	public static int gcd(int num1, int num2) {
		if (num1==0) 
			return num2;
		if (num2==0) 
			return num1;
		if (num1==num2)   // base case for recursion
            return num1;
        if (num1 > num2) 
        	return gcd(num1-num2, num2);
        else
           	return gcd(num1, num2-num1);
	}
}