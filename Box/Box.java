package Box;

class Shape {
    double width;
    double height;
    double depth;

    double volume() {
        return depth * height * width;
    }

    Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

public class Box {
    public static void main(String arg[]) {
        Shape myShape = new Shape(5, 2, 3);
        double volume = myShape.volume();
        System.out.println("Volume is: " + volume);
    }
}
