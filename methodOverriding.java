/*Write a simple java application that creates a Shape class with two double data members. 
The class should have an area method to calculate the area of shape. 
Inherit two classes Rectangle and Triangle from Shape class. 
Demonstrate method overriding & super keyword.*/

class Shape {

    // data fields
    double l;
    double b;

    // parameterized constructor
    Shape(double x, double y) {
        l = x;
        b = y;
    }

    // showing data of shape
    void showShapeData() {
        System.out.println("Length of the shape = " + this.l);
        System.out.println("Breadth of the shape = " + this.b);
    }

    // area method of the parent class
    void area() {
        System.out.println("Area is not defined at this level...");
    }
}

class Rectangle extends Shape {
    
    // constructor
    Rectangle(double l, double b) {
        // passing l & b in super() will initialize object by calling constructor of the super class(Shape)
        super(l, b);
    }

    // showing rectangle data
    void showRectangleData() {
        // calling showData method of the super class using super
        super.showShapeData();
    }

    // over-ridden area method
    void area() {
        // object will execute this method by overridding the area of the super class
        System.out.println("Area of this rectangle = " + super.l*super.b);
    }
}

class Triangle extends Shape {

    // constructor 
    Triangle(double l, double b) {
        super(l, b);
    }

    void showTriangleData() {
        super.showShapeData();
    }

    // over-ridden area method
    void area() {
        System.out.println("Area of this triangle = " + (super.l*super.b)/2 + "\n");
    }
}

public class methodOverriding {
    public static void main(String[] args) {

        System.out.println("\nObject of Shape class....");
        Shape shape1 = new Shape(12, 25);
        shape1.showShapeData();
        shape1.area();
        
        System.out.println("\nObject of Rectangle class....");
        Rectangle rect1 = new Rectangle(9, 11);
        rect1.showRectangleData();
        rect1.area();

        System.out.println("\nObject of Triangle class....");
        Triangle tri1 = new Triangle(11, 8);
        tri1.showTriangleData();
        tri1.area();
    }
}
