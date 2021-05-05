 
/*Design a class named Triangle to represent a Triangle. The class contains:
- Three double data fields named a, b and c specifying three sides of the triangle. 
   The default values are 1.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified values.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter. */

// defining the Triangle class

class Triangle {

    // Three sides of triangle with default value 1
    double a = 1;
    double b = 1;
    double c = 1;

    // no argument constructor, prints message when object of this class is created
    public Triangle() {
       System.out.println("Triangle created with default values a = b = c = 1.0 unit");
    }

    // parameterized constructor to create object with specified values
    public Triangle(double a, double b, double c) {
        // "this" keyword changes the values of current object from default values
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Triangle created with specified values: a = " + a + ", b = " + b + ", c = " + c + " unit");
    }

    // method to return area of triangle passed as argument
    static double getArea(Triangle t){
        double s, area;
        // calculating area using "Heron's Formula"
        s = 0.5*(t.a + t.b + t.c);
        area = Math.sqrt((s*(s-t.a)*(s-t.b)*(s-t.c)));
        return area;
    }

    // method to return perimeter of triangle passed as argument
    static double getPerimeter(Triangle t){
        double peri = t.a + t.b + t.c;
        return peri;
    }

    // main method
    public static void main(String[] args) {
 
        System.out.println("\nCreating triangle objects......");
        // creating object of Triangle class without values
        // it will get the default values of class
        Triangle t1 = new Triangle();

        // creating object of Triangle class with initial values
        Triangle t2 = new Triangle(2, 3, 4);

        // creating object and then assigning it values
        Triangle t3 = new Triangle();
        t3.a = 5; t3.b = 6; t3.c = 7;
        System.out.println("Values of triangle t3 changed to a = " + t3.a + ", b = " + t3.b + ", c = " + t3.c + " unit");

        // calling the getPerimeter() method
        System.out.print("\nCalculating perimeter of the triangles......");
        double per1 = getPerimeter(t1);
        System.out.println("\nPerimeter of the Triangle t1 is: " + per1 + " unit");

        double per2 = getPerimeter(t2);
        System.out.println("Perimeter of the Triangle t2 is: " + per2 + " unit");

        double per3 = getPerimeter(t3);
        System.out.println("Perimeter of the Triangle t3 is: " + per3 + " unit");

        // calling the getArea() method
        System.out.print("\nCalculating area of the triangles......");
        double area1 = getArea(t1);
        System.out.printf("\nArea of the Triangle t1 is: %.2f sq. unit\n", area1);

        double area2 = getArea(t2);
        System.out.printf("Area of the Triangle t2 is: %.2f sq. unit\n", area2);

        double area3 = getArea(t3);
        System.out.printf("Area of the Triangle t3 is: %.2f sq. unit\n", area3);
    }

}
