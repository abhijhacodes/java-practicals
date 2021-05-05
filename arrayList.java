/*Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a Circle object to 
the list, and use a loop to display all elements in the list by invoking the object’s to String() method. */

import java.util.*;

public class arrayList {
    
    public static void main(String[] args) {
       
        // arraylist that can contain objects of different classes
        ArrayList<Object> abhi_list = new ArrayList<Object>();
        abhi_list.add(new Loan(250000));
        abhi_list.add(new Date());
        abhi_list.add(new String("Abhishek Jha"));
        abhi_list.add(new Circle(10.5));

        // to print all objects of arraylist by applying tostring() method of that object
        for (int i = 0; i < abhi_list.size(); i++) {
            System.out.println((abhi_list.get(i)).toString());
        }
    }
}

class Circle {
    double radius;
    // parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // tostring method for circle object
    public String toString() {
        return "This circle has radius = " + this.radius;
    }
}

class Loan {
    double amount;
    // parameterized constructor
    public Loan(double amount) {
        this.amount =amount;
    }
    // tostring method for loan object
    public String toString() {
        return "This loan has amount = " + this.amount;
    }
}
