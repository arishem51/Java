package Excer;

public class Excer {
    public static void main(String args[]) {
        int a, d;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Behind exception line");
        } catch (Exception e) {
            System.out.println("Division by zero");
        }
        System.out.println("Outside try catch block");
    }
}
