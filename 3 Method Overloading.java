class Overload {
    double length, breadth; // class variables

    void area(int l, int b) { // local variables - parameters
        System.out.println("Area of rectangle: " + l * b);
    }

    void area(double b, double h) {
        System.out.println("Area of triangle: " + 0.5 * b * h);
    }

    void area(int l) {
        System.out.println("Area of square: " + l * l);
    }

    void area(double r) {
        System.out.println("Area of circle: " + 3.14 * r * r);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.area(10, 20); // arguments
        obj.area(10.5, 20.5);
        obj.area(20);
        obj.area(10.5);
    }
}