// code to generate vehicle plate number
import java.util.Scanner;

public class generateVehiclePlate {
public static void main(String[] args) {

    StringBuilder s = new StringBuilder(); // empty string builded

    // to generate 3 random letters
    for (int i = 0; i < 3; i++) {
        char ch = (char) (Math.random() * 26 + 'A');
        s.append(ch);
    }
    // to generate 4 random digits
    for (int i = 0; i < 4; i++) {
        char digit = (char) (Math.random() * 10 + '0');
        s.append(digit);
    }
    System.out.println("\nRandomly generated vehicle plate number: " + s);
  }
}