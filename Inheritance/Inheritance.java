package Inheritance;

class A {
    int i;
    private int j;

    private void setIJ(int i, int j) {
        this.i = i;
        this.j = j;
    }

    A(int i, int j) {
        setIJ(i, j);
    }

    void show() {
        System.out.println("I: " + this.i);
        System.out.println("J: " + this.j);
    }

}

class B extends A {
    int k;

    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("K: " + this.k);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        // A classA = new A(10, 20);
        B classB = new B(5, 7, 2);

        // System.out.println("This is class A: ");
        // classA.showIJ();
        // System.out.println();

        System.out.println("This is class B: ");
        classB.show();
        System.out.println();
    }
}
