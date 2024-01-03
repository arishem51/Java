package Lamda;

interface CheckShouldAddIntoTotal {
    boolean check(int n);
}

public class Lamda {

    private static int calculateSum(int num, CheckShouldAddIntoTotal checkShouldAddIntoTotal) {
        int i = 0;
        int total = 0;
        while (i <= num) {
            if (checkShouldAddIntoTotal.check(i)) {
                total += i;
            }
            i++;
        }
        return total;
    }

    private static int calculateSum(int num) {
        return calculateSum(num, x -> true);
    }

    public static void main(String[] args) {
        System.out.println("Total: " + calculateSum(5));
        System.out.println("Even Total: " + calculateSum(5, x -> x % 2 == 0));
        System.out.println("Odd Total: " + calculateSum(5, x -> x % 2 != 0));

    }
}
