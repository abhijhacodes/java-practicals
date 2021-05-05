// Write a simple java program to demonstrate various methods of StringBuilder class.

import java.util.*;
 
public class StringBuilder {

	public static void main(String[] args) {

		// empty string builder with initial capacity 16
		StringBuilder sb1 = new StringBuilder();

		// string builder with initial value 'abhi'
		StringBuilder sb2 = new StringBuilder("abhi");

		// empty string builder with capacity 30
		StringBuilder sb3 = new StringBuilder(30);

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
	}

}