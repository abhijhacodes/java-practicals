 /*StopWatch class with startTime, endTime private data fields
 and stop(), end() and getElapsedTime() methods */

import java.util.*;

// creating StopWatch class
class StopWatch {
   
    // private data fields
    private long startTime;
    private long endTime;

    // getter methods of startTime and endTime
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // non argument constructor
    public StopWatch() {
        /*we can also use System.currentTimeMillis() to set current time in milliseconds
        but for more precision i've used System.nanoTime() */

        this.startTime = System.nanoTime();
    }

    // starts the StopSatch
    public void start() {
        startTime = System.nanoTime();
    }

    // stops the StopSatch
    public void stop() {
        endTime = System.nanoTime();
    }

    // returns elapsedTime (time passed)
    public long getElapsedTime() {
        return (endTime - startTime)/1000000;
    }
}

public class stopwatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creating StopWatch object
        StopWatch sw1 = new StopWatch();

        // creating menu driven program for StopWatch
        System.out.println("\n------StopWatch by Abhi Jha------");
        System.out.println("1> Start stopwatch.\n2> Stop stopwatch.\n3> Get elapsed time.\n4> Close StopWatch.");
        
        while(true) {
            System.out.print("\nEnter your choice: ");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("\tStopWatch started...");
                    sw1.start();
                    break;
                case 2:
                    System.out.println("\tStopWatch stopped...");
                    sw1.stop();
                    break;
                case 3:
                    long elapsedTime = sw1.getElapsedTime();
                    double timeSecond = elapsedTime/1000.0;
                    System.out.println("\tThe elapsed time is: " + elapsedTime + " milliseconds (" + timeSecond + " seconds)");
                    break;
                case 4:
                    System.out.println("\tClosing the StopWatch...");
                    System.exit(0);
                default:
                    System.out.println("\tPlease choose a valid option.");
                    break;
            }
        }
    }
}