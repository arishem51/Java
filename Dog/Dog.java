package Dog;

class Dog {
    int size;
    String bread;
    String name;

    void bark() {
        System.out.printf("Ruff ruff!");
    }
}

class DogTestDrive {
    public static void main(String[] arg) {
        Dog myDog = new Dog();
        myDog.size = 40;
        myDog.bark();
    }
}
