/*Write a program which defines a validate() method to validate the entered password. 
The password must have one capital letter, one digit and one special character from {$, #, %}
set. The length of password must be at least 8. If the password is valid, the
method should return true otherwise false.*/

import java.util.*;

class CheckPassword {

    // static method to check password validity
    public static boolean validate(String password){
        boolean isValid = false;

        // to check if length is at least 8 and
        // it does not contain any blank space
        // and contains at least one special character from {$,#,%}
        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(password.contains("$") || password.contains("#") || password.contains("%")){
                    isValid = true;
                    // if all conditions are satisfied then isValid=true
                }
            }
        }

        // only if above conditions are satisfied (i.e isValid=true)
        // to check if it contains at least one capital letter and a digit
        if(isValid){
            boolean capitalFlag = false;
            boolean digitFlag = false;
            char ch;

            // checking each character
            for(int i=0; i<password.length(); i++){
                ch = password.charAt(i);
                if(Character.isDigit(ch)){
                    digitFlag = true;
                    // if a digit is found
                }
                else if(Character.isUpperCase(ch)){
                    capitalFlag = true;
                    // if a capital letter is found
                }
            }
            // if any of above two conditions are not satisfied then isValid=false
            // or if satisfied then isValid is already true
            if(!capitalFlag || !digitFlag){
                isValid = false;
            }
        }

        // returns true or false based on above conditions
        return isValid;
    }
}
public class passwordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your password: ");
        String password = scan.nextLine();

        // calling the static validate method of checkPassword class
        if(CheckPassword.validate(password)){
            // if it returns true
            System.out.println("Valid Password....");
        } else {
            // if it returns false
            System.out.println("Invalid Password....");
        }
        scan.close();
    }
}
