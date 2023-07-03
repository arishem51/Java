package MetricSystem;

import java.util.Scanner;

public class MetricSystem {
    public static double convertInchToCm(double value) {
        final double CM_PER_INCH = 2.54;
        return value * CM_PER_INCH;
    }

    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many inches? ");
        inch = scanner.nextInt();
        cm = convertInchToCm(inch);
        System.out.printf("%d inches = %.2f cm\n", inch, cm);
    }
}