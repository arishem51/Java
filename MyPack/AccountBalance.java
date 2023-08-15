package MyPack;

public class AccountBalance {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Hung", 4000);
        current[1] = new Balance("An", 5000);
        current[2] = new Balance("Ann", -1200);

        System.out.println();
        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
        System.out.println();
    }
}

class Balance {
    String name;
    double bal;

    private static boolean isLowerThanZero(double num) {
        return num < 0;
    }

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (isLowerThanZero(bal)) {
            System.out.print("--> ");
        }
        System.out.println(name + ": " + bal + "$");
    }
}
