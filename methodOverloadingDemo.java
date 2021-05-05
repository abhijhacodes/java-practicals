/*Write a simple java application that defines a class Complex with real(int) and 
img(int) as data fields, no-argument constructor and parameterized constructor. 
The class should have overloaded methods to perform addition of two Complex numbers by passing objects 
as arguments.Demonstrate this keyword in a parameterized constructor.*/

class Complex {
    // real and imaginary data fields for class complex
    int real;
    int img;

    // no-arg contructor
    public Complex() {
        real = 0;
        img = 0;
    }

    // parameterized constructor with "this" keyword
    public Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    // method to add one complexnumber passed as argument 
    // to the number who called it and return result
    public Complex addition(C omplex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

    // ---->>> overloaded method
    // this method will take two complex numbers as input argument and 
    // return result of their addition
    public static Complex addition(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
  
}

class methodOverloading {

    public static void main(String[] args) {
        
        // creating two objects of class Complex and adding using first method
        Complex num1 = new Complex(3,4);
        Complex num2 = new Complex(1,2);
        Complex res = Complex.addition(num1, num2);
        System.out.println("Addition of " + num1.real + " + " + num1.img + "i and " + num2.real + " + " + num2.img + "i");
        System.out.println("Result = " + res.real + " + " + res.img + "i");

        // creating two objects of class Complex and adding using overloaded method
        Complex num3 = new Complex(4,12);
        Complex num4 = new Complex(9,18);
        Complex res1 = num3.addition(num4);
        System.out.println("Addition of " + num3.real + " + " + num3.img + "i and " + num4.real + " + " + num4.img + "i");
        System.out.println("Result = " + res1.real + " + " + res1.img + "i");

    }
}