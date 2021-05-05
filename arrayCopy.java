/* Write a program which has array_copy method to copy contents
 from one integer array to another. Display contents of copied array in main method.*/

public class arrayCopy {

	public static void array_copy(int a[], int l) {
		
		// declaring empty array to copy contents into
		int[] b = new int[l]; 
		System.out.println("\nCopying contents of array [a] into array [b].......");
		
		// main logic of the method
		for (int i=0; i<l; i++) {
			b[i] = a[i];
		}

        // printing the copied array
        System.out.print("\nCopied array [b] is: [");
		for (int i=0; i<l-1; i++) {
			System.out.print(b[i] + ", ");
		} System.out.println(b[l-1] + "]");
	}

	public static void main(String[] args) {
		// declaring array with values
		int[] a = {12,34,45,1,67,98};

        // printing original array
		System.out.print("\nOriginal array [a] is: [");
		for (int i=0; i<(a.length - 1); i++) {
			System.out.print(a[i] + ", ");
		} System.out.println(a[a.length - 1] + "]");

        // calling array_copy method
		array_copy(a, a.length);
	}
}