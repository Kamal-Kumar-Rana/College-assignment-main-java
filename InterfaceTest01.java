interface Area {
    double compute(double x, double y);
}

class Rectangle implements Area {
    public double compute(double x, double y) {
        return (x * y);
    }

}

class Circle implements Area {
    double pi = 3.1415;

    public double compute(double x, double y) {
        return (pi * x * y);
    }

}

public class InterfaceTest01 {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        System.out.println("Area of Rectangle is: " + r1.compute(10, 12.5));
        System.out.println("Area of Circle is: " + c1.compute(4.5, 1.5));
    }
}
