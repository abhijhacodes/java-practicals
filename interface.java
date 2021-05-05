/* Write a simple java application that creates an interface Shape. The
interface declares read() and show() methods and PI as constant data member.
Create classes Rectangle and Circle that implement a shape interface. 
Assume suitable data and member methods */


import java.util.*;

interface Shape {
    final double PI = Math.PI;

    // in interface all methods are abstract by default, 
    // so no need to use abstract keyword 
    void read();
    void show();
    void area();
}

class Rectangle implements Shape {

    double length, breadth;
    Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.print("Enter length of rectangle: ");
        this.length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        this.breadth = sc.nextDouble();
    }

    public void show() {
        System.out.println("Dimensions of this rectangle are: ");
        System.out.println("Length = " + this.length + " unit");
        System.out.println("Breadth = " + this.breadth + " unit");
    }

    public void area() {
        System.out.println("Area of this rectangle: " + this.length*this.breadth + " unit square");
    }
}

class Circle implements Shape {
    
    double radius;
    Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.print("Enter radius of circle: ");
        this.radius = sc.nextDouble();
    }

    public void show() {
        System.out.println("Dimension of this circle is: ");
        System.out.println("Radius = " + this.radius + " unit");
    }

    public void area() {
        System.out.println("Area of this circle: " + PI*this.radius*this.radius + " unit square" + "\n");
    }
}

public class interface {
    public static void main(String[] args) {
        System.out.println("\n-------Rectangle object-------");
        Rectangle rect = new Rectangle();
        rect.read();
        rect.show();
        rect.area();

        System.out.println("\n-------Circle object-------");
        Circle cir = new Circle();
        cir.read();
        cir.show();
        cir.area();
    }
}