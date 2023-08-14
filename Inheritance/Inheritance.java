package Inheritance;

class A {
    int i;
    private int j;

    void setIJ(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void showIJ() {
        System.out.println("I and J: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("K: " + k);
    }

    void setIJK(int i, int k, int j) {
        this.setIJ(i, j);
        this.k = k;
    }
}

public class Inheritance {
    public static void main(String args[]) {
        A classA = new A();
        B classB = new B();

        classA.setIJ(10, 20);
        System.out.println("This is class A: ");
        classA.showIJ();
        System.out.println();

        classB.setIJK(5, 7, 2);
        System.out.println("This is class B: ");
        classB.showIJ();
        System.out.println();

        // WTF dude?
        classA = classB;
    }
}
