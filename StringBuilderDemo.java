// Write a simple java program to demonstrate various methods of StringBuilder class.

import java.util.*;
import java.lang.StringBuilder;
 
public class StringBuilderDemo {

	public static void main(String[] args) {

		// empty string builder with initial capacity 16
		StringBuilder sb1 = new StringBuilder();

		// empty string builder with capacity 30
		StringBuilder sb2 = new StringBuilder(30);

		// string builder with initial value "abhi"
		StringBuilder sb = new StringBuilder("Abhi");

		System.out.println("\nStringBuilder initially: " + sb);

		// append method adds string at last
		System.out.println("StringBuilder after appending: " + sb.append(" Jha"));

		// insert string at given index
		System.out.println("StringBuilder after inserting at given index: " + sb.insert(4, "shek"));

		// replacing a part of stringbuilder
		System.out.println("StringBuilder after replacement: " + sb.replace(4, 8, "****"));

		// deleting a part of stringbuilder
		System.out.println("StringBuilder after deletion: " + sb.delete(4, 8));

		// reversing the new stringbuilder 
		StringBuilder str = new StringBuilder("Reversing....");
		System.out.println("New StringBuilder: " + str);
		System.out.println("Reversed StringBuilder: " + str.reverse());

		// capacity of stringbuilder
		StringBuilder sb3 = new StringBuilder("Hello "); // initial capacity is 16
		sb3.append("I love Java and Python"); // increased capacity 
		System.out.println("Capacity of the StringBuilder '" + sb3 + "': " + sb3.capacity());

		// character at given index
		System.out.println("Character at index 6: " + sb3.charAt(6));

		// length of the stringbuilder
		System.out.println("Length of StringBuilder: " + sb3.length());

		// substring of stringbuilder
		System.out.println("Substring (from index 6): " + sb3.substring(6));
		System.out.println("Substring (from index 13 to 17): " + sb3.substring(13, 17));
	}
}