package Hello;

public class Hello {

    public static void main(String[] arg) {
        int x = 1;
        int stopLoopPoint = 4;
        System.out.println("Before the loop");
        while (x < stopLoopPoint) {
            System.out.println("Inside the loop!");
            System.out.println("Value of the loop is " + x);
            x++;
        }
        System.out.println("Outside the loop!");
    }
}
