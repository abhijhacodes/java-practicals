/* Write a program for calculator to accept an expression as a string in
which the operands and operator are separated by zero or more spaces.
For ex: 3+4 and 3 + 4 are acceptable expressions. */

import java.util.Scanner;

public class stringCalculator {

 public static void main(String[] args) {
 	

  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter Equation in string form: ");
  String str = input.nextLine();

  // replacing all blank spaces with empty character i.e. deleting spaces
  String s = str.replaceAll(" ","");
  
  // input validation
  if (s.length() < 3) {
   	  System.out.println("Minimum 2 Opearators and 1 Opearand Required\n");
   	  System.exit(0);
  }

  int result = 0;   
  int i = 0;

  // incrementing i until any operator is found
  while(s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*' && s.charAt(i)!='/' && s.charAt(i)!='%')
  {
      i++;
  }

  // character at i index wil be an operator
  char opr = s.charAt(i);

  // making two operands a and b using substring method of String class
  int a = Integer.parseInt(s.substring(0,i));
  int b = Integer.parseInt(s.substring(i+1,s.length()));

  // doing calculation on basis of the operator entered
  switch (opr) {
	case '+':
		result = a + b; 
		break;
	case '-':
		result = a - b;
		break;
	case '*':
		result = a * b;
		break;
	case '/':
		result = a / b; 
		break;
	case '%':
		result = a % b; 
		break; 
	default:
		System.out.println("Please enter a valid operator\n");    
		break;  	
  }

  // printing result of calculation
  System.out.println("Result: " + a + " " + opr + " " + b + " = " + result);

 }
}