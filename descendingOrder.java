// code to take 3 interger inputs and print them in decreasing order 
import java.util.Scanner;

public class descendingOrder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter 1st number: ");
		int n1 = input.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = input.nextInt();
		System.out.print("Enter 3rd number: ");
		int n3 = input.nextInt();
		
        int t; // temporary variable for swapping values
		if (n1 < n2) {
			t = n1;
			n1 = n2;
			n2 = t;
		}
	    if (n3 > n2) {
	    	if (n3 > n1) {
	    	    t = n3;
	    	    n3 = n2;
	    	    n2 = n1;
	    	    n1 = t;
	        }
	        else {
	        	t = n3;
	        	n3 = n2;
	        	n2 = t;
	        }
	    }
       System.out.println("The three numbers in decreasing order are: "+ n1 + "\t" + n2 + "\t" + n3);
    }
}