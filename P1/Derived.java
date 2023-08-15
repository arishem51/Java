package P1;

class Derived extends Protection {
    Derived() {
        System.out.println("Derived");
        // System.out.println("n_pri = " + n_pri); Can't access
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
