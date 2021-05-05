/*Write the bin2Dec (string binary String) method to convert a binary string into a decimal number. 
Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.*/

import java.util.*;

public class binaryToDecimal {
    
    // "throws" keyword is used to indicate this method might throw an
    // exception so we need to handle using try catch

    public static int bin2Dec(String binStr) throws NumberFormatException {
        int dec = 0;
        int len = binStr.length();

        for (int i = 0; i < len; i++) {

            // throws exception if any character is not 0 or 1
            if(binStr.charAt(i) < '0' || binStr.charAt(i) > '1') {
                throw new NumberFormatException("Input string is not Binary !");
            }

            // logic to convert binary bit to decimal digit and add it
            dec += (binStr.charAt(i) - '0')*Math.pow(2, len-i-1);
        }
        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a binary number: ");
        String bin = sc.nextLine();

        // tries to call bin2Dec method
       try {
           System.out.println("Decimal equivalent = " + bin2Dec(bin));
       } 
       // throws exception if it's not binary string 
       catch (NumberFormatException e) {
           System.out.println(e);
       }

       sc.close();
    }
}

