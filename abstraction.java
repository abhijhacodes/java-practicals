/* Write a simple java application that creates a Shape class with two
double data members. The class should have one abstract method area to
calculate the area of shape. Inherit two classes Rectangle and Triangle from
Shape class. Demonstrate runtime polymorphism. */

import java.util.*;

abstract class Shape {
    double length; // data members
    double width;

    // constructor
    public Shape(double a, double b){
        this.length = a;
        this.width = b;
    }
    void func() {
        System.out.println("This is a shape....");
    }

    // abstract method to calculate area of shape
    abstract void area();
}

class Rectangle extends Shape {
    public Rectangle(double a, double b){
        super(a, b);
    }

    // defines the abstract area method for rectangle
    public void area() {
        double areaOfRectangle = this.length*this.width;
        System.out.println("Area of rectangle = " + areaOfRectangle);
    }

    @Override
    void func() {
        System.out.println("This is a rectangle....");
     }
}

class Triangle extends Shape {
    public Triangle(double a, double b){
        super(a, b);
    }

    // defines the abstract area method for triangle
    public void area() {
        double areaOfTriangle = (this.length*this.width)/2;
        System.out.println("Area of triangle = " + areaOfTriangle);
    }

    @Override
    void func() {
        System.out.println("This is a triangle....");
     }
}

public class abstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        double a = scan.nextDouble();
        System.out.print("Enter width: ");
        double b = scan.nextDouble();
        Shape s1, s2;
        // creating objects of subclass with reference to superclass - upcasting
        s1 = new Rectangle(a, b); 
        s2 = new Triangle(b, b);

        // overridden func() method gives output according to the overridden method of 
        // that object at runtime - runtime polymorphism
    
        System.out.println("\nProcessing Rectangle object....");
        s1.func();
        s1.area();
        // area method calculates area by formula defined in it's subclass 
        // that defines the abstract area method of super class

        System.out.println("\nProcessing Triangle object....");
        s2.func();
        s2.area();
        scan.close();
    }

}
