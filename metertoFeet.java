// meter to feet conversion

import java.util.Scanner;

class meterToFeet {
	public static void main(String[] args) {
		float number;
		Scanner s1 = new Scanner(System.in);

		System.out.print("\nEnter the value of number (in meters): ");
		number = s1.nextFloat();

		number = number*(3.2808f);  // equation for meter -> feet 

		System.out.println("\nThe value of number in feet is: " + number);
	}
}