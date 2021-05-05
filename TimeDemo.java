 /* class Time with hour and minute private data fields, non arg and 
 parameterized constructors, and getTime(), ahead(), add() and showTime() methods */

import java.util.*;

// creatng Time class
class Time {

 	// private data fields
	private int hour;
	private int minute;

	// non arg constructor
	public Time() {
		this.hour = 0;
		this.minute = 0;
	}	

	// parameterized constructor
	public Time(int hr, int min) {
		System.out.printf("Time object created with values, hour = %d, minute = %d\n", hr, min);
		this.hour = hr;
		this.minute = min;
	}

	// method to get time from the user
	public void getTime() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of hour: ");
		int hr = sc.nextInt();
		System.out.print("Enter value of minute: ");
		int min = sc.nextInt();

		hour = ((hr>=0 && hr<24) ? hr : 0);
		minute = ((min>=0 && min<60) ? min : 0);

		System.out.printf("Time object created with values, hour = %d, minute = %d\n", hou
			r, minute);
	}

	// method to show which of the two times is ahead of the other
	public static void ahead(Time t1, Time t2) {
		if(t1.hour == t2.hour) {
			if (t1.minute > t2.minute)
				System.out.println(t1.showTime() + " is ahead of " + t2.showTime());
			else if(t1.minute < t2.minute)
				System.out.println(t2.showTime() + " is ahead of " + t1.showTime());
			else
				System.out.println("Both times are equal.");
		} 
		else {
			if(t1.hour > t2.hour)
				System.out.println(t1.showTime() + " is ahead of " + t2.showTime());
			else
				System.out.println(t2.showTime() + " is ahead of " + t1.showTime());
		}
	}

	// method to add two Time objects and return third object
	public static Time add(Time t1, Time t2) {
		
		int hrSum = t1.hour + t2.hour;
		if(hrSum >= 24) {
			hrSum -= 24;
		}
		int minSum = t1.minute + t2.minute;
		if(minSum >= 60) {
			minSum -= 60;
			hrSum += 1;
		}
		Time timeAdd = new Time(hrSum, minSum);
		return timeAdd;
	}

	// method to display time in required format
	public String showTime() {
		return String.format("%02d:%02d", hour, minute);
	}
}

public class TimeDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// creating menu driven program for Time class
		System.out.println("\n-----Time class (24 Hour Format)-----\n");
		System.out.println("1> Create time object using parameterized constructor.");
		System.out.println("2> Create time object and get values from user.");
		System.out.println("3> Show time.");
		System.out.println("4> Check which time is ahead.");
		System.out.println("5> Add two time objects.");
		System.out.println("6> Exit.");

		while(true) {
            System.out.print("\nEnter your choice: ");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                	Time t1 = new Time(12, 20);
                	break;
                case 2:
                	Time t2 = new Time();
					t2.getTime();
					break;
				case 3:
					Time t3 = new Time();
					t3.getTime();
					System.out.println("The time is: " + t3.showTime());
					break;
				case 4: 
					Time t4 = new Time(), t5 = new Time();
					System.out.println("Enter values of first time...");
					t4.getTime();
					System.out.println("Enter values of second time...");
					t5.getTime();
					Time.ahead(t4, t5);
					break;
				case 5:
					Time t6 = new Time(), t7 = new Time();
					System.out.println("Enter values of first time...");
					t6.getTime();
					System.out.println("Enter values of second time...");
					t7.getTime();
					Time timeAdd = new Time();
					timeAdd = Time.add(t6, t7);
					System.out.println("Addition of time objects " + t6.showTime() + " and " + t7.showTime() + " is = " + timeAdd.showTime());
					break;
				case 6:
					System.out.println("Exiting from the time class...");
					System.exit(0);
				default:
					System.out.println("\tPlease choose a valid option.");
                    break;
		    }
	    }
	}
}