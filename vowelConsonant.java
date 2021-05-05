 // to print entered letter is vowel or consonant
 import java.util.Scanner;

 public class vowelConsonant {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);
 		System.out.print("\nEnter a letter: ");
 		char lt = input.next().charAt(0);  // char scanning
         
 		if (lt=='a'||lt=='A'||lt=='e'||lt=='E'||lt=='i'||lt=='I'||lt=='o'||lt=='O'||lt=='u'||lt=='U'){
 			System.out.println("\nThe letter (" + lt + ") you entered is a vowel !");
 		}
 		else{
 			System.out.println("\nThe letter (" + lt + ") you entered is a consonant !");
 		}
 	}
 }