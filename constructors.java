
class Triangle {
    static double a = 1;
    static double b = 1;
    static double c = 1;

    public Triangle() {
       System.out.println("Triangle created");
    }

    public Triangle(double a, double b, double c) {
        System.out.println("Triangle created with specified values, a = " + a + " b = " + b + " c = " + c);
    }

    public double getArea(double a, double b, double c){
        double area = a;
        return area;
    }

    public static void getPerimeter(double a, double b, double c){
        double peri = a+b+c;
        System.out.println(peri);
    }
}

public class constructors {

    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(2, 3, 4);
        //System.out.println(t2.a);
        getPerimeter(t2.a, t2.b, t2.c);

    }

}