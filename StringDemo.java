// write a simple java program to demonstrate various methods of String class
 
import java.util.*;

public class StringDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //defining string
		// common method 
		String s = "Abhishek Jha";
		// traditional method
		String s0 = new String("Traditional string");

        System.out.println("String is: " + s);
        
        // length of string and isempty
        System.out.println("Length of the string is: " + s.length());
        System.out.println("Is string empty ? " + s.isEmpty());
        
        // character at i and substrings
        System.out.println("Character at index 2 is: " + s.charAt(2));
        System.out.println("Substring (from index 9): " + s.substring(9));
        System.out.println("Substring (from index 0-8): " + s.substring(0, 8));

        // concatenation
        String s1 = "first string", s2 = " second string";
        System.out.println("Concatenation of " + s1 + " and" + s2 + " : " + s1.concat(s2));

        // index of character
        System.out.println("Index of i in " + s + ": " + s.indexOf('i'));
        System.out.println("Index of a after index 1: " + s.indexOf('a',1));

        // equals
        System.out.println("Does " + s1 + " equals " + s2 + "? " + s1.equals(s2));

        // converting to lowercase, uppercase
        String low = "this is in lowercase";
        String up = "THIS IS IN UPPPERCASE";
        System.out.println("Lowercase of '" + up + "': " + up.toLowerCase());
        System.out.println("Uppercase of '" + low + "': " + low.toUpperCase());

        // trimming the string
        String strim = "     scet surat  ";
        System.out.println("Before trimming: " + strim);
        System.out.println("After trimming: " + strim.trim());

        // replacing character
        System.out.println("Replacing h with '*': " + s.replace('h', '*'));

        // startswith, endswith and contains
        System.out.println("Does " + s + " starts with 'Abhi' ? " + s.startsWith("Abhi"));
        System.out.println("Does " + s + " starts with 'shek' ? " + s.startsWith("shek"));
        System.out.println("Does " + s + " ends with 'Jha' ? " + s.endsWith("Jha"));
        System.out.println("Does " + s + " ends with 'shek' ? " + s.endsWith("shek"));
        System.out.println("Does " + s + " contains 'hi' ? " + s.contains("hi"));
        System.out.println("Does " + s + " contains 'poem' ? " + s.contains("poem"));

        // splitting the string at special symbol (here -)
        String str = "Example-of-split-string-in-java";
        System.out.println("String: " + str);
        System.out.print("After splitting: ");
        String[] splitStr = str.split("-");
        // this kind of for loop iterates through all elements in any iteratable item
        for(String spl: splitStr) {
            System.out.print(spl + " ");
        }

        // join string 
        System.out.println("\nJoining strings with '#': ");
        String joinStr = String.join("#", "Abhishek", "Jha", "Computer", "Surat");
        System.out.println(joinStr);

        // string formatting
        System.out.println("Formatting string for date: ");
        System.out.print("Enter day: ");
        int date = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        String dateFormat = String.format("%02d/%02d/%04d", date, month, year);
        System.out.println("Date in correct format: " + dateFormat);

    }
}
