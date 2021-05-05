/*Write a program that prompts the user to enter a decimal number and displays the number in a fraction.
Hint: Read the decimal number as a string, extract the integer part and fractional part from the string.*/

import java.util.*;

public class decimalToFraction {

    // class to construct fractional objects
    public static class Fraction {
        private int nume; // numerator
        private int deno; // denominator
        
        // no-arg constructor
        public Fraction(int n, int d) {
            nume = n;
            deno = d;
        }

        // gcd method
        public long gcd(long a, long b) {
            if(a==0) return b;
            else if(b==0) return a;
            if(a < b) return gcd(a, b%a);
            else return gcd(b, a%b);
        }

        // to display fractional number
        public String toString() {
            long gcd = gcd(nume, deno);
            return nume/gcd + " / " + deno/gcd;
        }
    }

    // decimalToFraction converter method
    public static void decimalToFraction(String dec) {
        int index = dec.indexOf(".");
        int len = (dec.substring(index+1)).length();
        // calculating denominator
        int denominator = (int)(Math.pow(10,len));
        // calculating numerator
        int numerator = (int)(Double.parseDouble(dec)*denominator);
        Fraction frac = new Fraction(numerator, denominator);
        // printing the result(Fractional number)
        System.out.println("The fractional number is: " + frac + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // driver code
            System.out.print("\nEnter a decimal number: ");
            String decimal = sc.nextLine();
            decimalToFraction(decimal);  
            System.out.print("\nEnter a decimal number: ");
            String decimal1 = sc.nextLine();
            decimalToFraction(decimal1); 
            System.out.print("\nEnter a decimal number: ");
            String decimal2 = sc.nextLine();
            decimalToFraction(decimal2); 
    }
}
