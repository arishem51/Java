package Inheritance.FindAreas;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        double result = dim1 * dim2;
        System.out.println("Triangle area: " + result);
        return result;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        double result = dim1 * dim2 / 2;
        System.out.println("Triangle area: " + result);
        return result;
    }
}

public class FindAreas {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref;

        figref = r;
        figref.area();

        figref = t;
        figref.area();

    }
}
