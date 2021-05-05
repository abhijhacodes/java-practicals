/* Write a simple java application that declares Employee class. 
The program should generate and handle custom exceptions such as
a. InvalidEmailAddressException if the address does not contain . and @ 
b. InvalidTelephoneNumberException if total no of digits > 10. */


import java.util.Scanner;

class InvalidEmailAddressException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidEmailAddressException() {}   
}

class InvalidTelephoneNumberException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidTelephoneNumberException() {}   
}

class customException {
    
    public static void lines() {
        System.out.println("-----------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        lines();
        try {
            System.out.print("Enter your email address: ");
            String email = sc.nextLine();
            System.out.print("Enter your telephone number: ");
            String telephone = sc.nextLine();
            lines();

            if(!email.contains(".") || !email.contains("@")) {
                throw new InvalidEmailAddressException();
            } else {
                System.out.println("Email address is valid!");
            }

            if(telephone.length() > 10) {
                throw new InvalidTelephoneNumberException();
            } else {
                System.out.println("Telephone number is valid!");
            }
        }

        catch(InvalidEmailAddressException e) {
            System.out.println("Invalid email address, '.' or '@' missing");
        }

        catch(InvalidTelephoneNumberException e) {
            System.out.println("Invalid telephone number, number of digits cannot be more than 10");
        }
        lines();
    }
}
