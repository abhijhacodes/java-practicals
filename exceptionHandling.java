/* Write a simple java application that reads marks of five subjects
through command line arguments and displays the average.
The application should generate an exception if marks are
 not in integer format and out of 0-100. */


// creating custom exception for value not in range
class NotInRangeException extends Exception {
    private static final long serialVersionUID = 1L;

    public NotInRangeException() {
        System.out.println("\nEntered value is not in range!");
    }
}

public class exceptionHandling {
    public static void main(String[] args) {
        // number of arguments should be 5
        if(args.length != 5) {
            System.out.println("\nPlease enter marks of '5' subjects!");
            System.exit(0);
        }

        try{
            int sum = 0;
            double avg = 0.0;
            for(String str: args){
                // converting each string command line argument into integer and computing average
                int marks = Integer.parseInt(str);

                // throw exception if not in range
                if(marks < 0 || marks > 100){
                    throw new NotInRangeException();
                }
                sum += marks;
            }
            avg = sum / 5;
            System.out.println("\n----------------------------------------------");
            System.out.println("Average of your marks in 5 subjects = " + avg);
            System.out.println("----------------------------------------------");
        }

        // catching custom exception
        catch(NotInRangeException e) {
            System.out.println("Enter marks only in the range of [0-100]");
        }

        // if number is not in integer format
        catch(NumberFormatException e) {
            System.out.println("\nEnter marks only in integer format!");
        }

    }
}
