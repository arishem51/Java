package Enumerations;

enum Apple {
    Hung(4), Anh(2), An(3);

    private int price;

    Apple(int num) {
        price = num;
    }

    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}

public class Enumerations {
    public static void main(String args[]) {
        Apple ap = Apple.Hung;

        System.out.println("Hung apples: " + Apple.Hung.getPrice());
        System.out.println(ap.getClass().getName());

    }
}
