/*Write a simple java application that defines a class Student with roll_no(int), 
name(String), address(String) & branch(String) as data fields. The class should have getData() & showData() methods.
 The program should create an array of Student objects, get the details and display it. 
 Create branch_dis(student[] s) method to display all objects having computer branch.*/

import java.util.*;

class Student {
    // data feilds of student class
    int roll_no;
    String name;
    String address;
    String branch;

    Scanner sc = new Scanner(System.in);

    // method to get the data input from user
    public void getData() {
        System.out.print("Enter student roll number: ");
        this.roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        this.name = sc.nextLine();
        System.out.print("Enter student address: ");
        this.address = sc.nextLine();
        System.out.print("Enter student branch: ");
        this.branch = sc.nextLine();
    }

    // method to display details of each object of student class
    public void showData() {
        System.out.println("Student's roll number: " + this.roll_no);
        System.out.println("Student's name: " + this.name);
        System.out.println("Student's address: " + this.address);
        System.out.println("Student's branch: " + this.branch);
    }

    // static method that will take the student array as input
    // and display details of students of computer branch only
    public static void branch_dis(Student[] s){
        int count = 0;
        for(int i=0; i<s.length; i++) {

            // regex matching for strings
            if((s[i].branch).matches("Computer|computer|comp|Comp|CO|co")) {
                count++;
                System.out.println();
                s[i].showData();
            }
        }
        // if no student is there is computer branch
        if(count == 0) {
            System.out.println("No student present in Computer branch.");
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("\nHow many Student objects you want to create: ");
       int n = sc.nextInt();
       
       // initializing the student array of size entered by user
       Student[] array = new Student[n];

        // taking data using getData() method for all the objects created 
       for (int i = 0; i < n; i++) {
           System.out.println("\n----Enter details of student " + (i+1) + ": ----");
           array[i] = new Student();
           array[i].getData();
       }
       
       // displaying details of all student objects
       System.out.println("\n-----Showing Student Details-----");
       for (int i = 0; i < n; i++) {
           System.out.println("\n----Details of student " + (i+1) + ": ----");
           array[i].showData();
        }

        // showing details of students of computer branch only
        System.out.println("\n---Showing details of students of Computer branch---");
        Student.branch_dis(array);
     }
}
