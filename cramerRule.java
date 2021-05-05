//solving equation using cramer's rule

import java.util.Scanner;

class cramerRule {
	public static void main(String[] args) {
		float a,b,c,d,e,f;  // constants
		float x,y;  // variables
		Scanner s1 = new Scanner(System.in);

		System.out.println("\nEnter values for equation ax + by = e");
		System.out.print("Enter value of a: ");
		a = s1.nextFloat();
		System.out.print("Enter value of b: ");
		b = s1.nextFloat();
        System.out.print("Enter value of e: ");
		e = s1.nextFloat();

		System.out.println("\nEnter values for equation cx + dy = f");
		System.out.print("Enter value of c: ");
		c = s1.nextFloat();
		System.out.print("Enter value of d: ");
		d = s1.nextFloat();
        System.out.print("Enter value of f: ");
		f = s1.nextFloat();

		// equations for finding values of x and y
		x = ((e*d) - (b*f))/((a*d) - (b*c));
		y = ((a*f) - (e*c))/((a*d) - (b*c));

		// displaying the result
		System.out.print("\nValue of x: " + x);
		System.out.print("\nValue of y: " + y);
	}
}