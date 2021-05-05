/*Write a program which takes two numbers and operator from 
the user and perform mathematical operation on entered two numbers.*/

import java.util.*;

public class mathOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter a math operator: ");
		char op = sc.next().charAt(0);
        // took operator input as a character

        /* switch statement to compare input operator with arithmetic 
        operators and perform necessary operations */
		switch (op) {
			case '+':
			System.out.println("\nYou entered '+' (Addition) operator");
			System.out.printf("Addition result, %d + %d = %d\n", a, b, a+b);
			break;
			case '-':
			System.out.println("\nYou entered '-' (Subtraction) operator");
			System.out.printf("Subtraction result, %d - %d = %d\n", a, b, a-b);
			break;
			case '*':
			System.out.println("\nYou entered '*' (Multiplication) operator");
			System.out.printf("Subtraction result, %d * %d = %d\n", a, b, a*b);
			break;
			case '/':
			System.out.println("\nYou entered '/' (Division) operator");
			System.out.printf("Division result, %d / %d = %d\n", a, b, a/b);
			break;
			case '%':
			System.out.println("You entered '%' (Modulus) operator");
			System.out.println("Modulus result, " + a + " % " + b + " = " + (a%b));
			break;
		}
	}
}