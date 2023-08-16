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
        System.out.println(ap.equals(Apple.Anh));
        System.out.println(ap.equals(Apple.Hung));

        for (Apple item : Apple.values()) {
            System.out.println(item + " costs " + item.getPrice());
        }
    }
}
