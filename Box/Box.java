package Box;

class Shape {
    double width;
    double height;
    double depth;
    static final int NOT_INITIALIZE = -1;

    double volume() {
        return depth * height * width;
    }

    Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Shape() {
        this.width = NOT_INITIALIZE;
        this.height = NOT_INITIALIZE;
        this.depth = NOT_INITIALIZE;
    }

    Shape(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }
}

public class Box {
    public static void main(String arg[]) {
        Shape myShape = new Shape(5, 2, 3);
        Shape myCube = new Shape(5);
        Shape noDimShape = new Shape();
        System.out.println("Volume is: " + myShape.volume());
        System.out.println("Volume is: " + myCube.volume());
        System.out.println("Volume is: " + noDimShape.volume());
    }
}
