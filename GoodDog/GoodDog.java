package GoodDog;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

class GoodDogTestDrive {

    public static void main(String[] arg) {
        GoodDog firstDog = new GoodDog();
        firstDog.setSize(70);
        GoodDog secondDog = new GoodDog();
        secondDog.setSize(8);
        System.out.println("Dog one: " + firstDog.getSize());
        System.out.println("Dog two: " + secondDog.getSize());
        firstDog.bark();
        secondDog.bark();
    }
}
