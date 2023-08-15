package p2;

import P1.Protection;

class Protection2 extends Protection {
    Protection2() {
        super();
        System.out.println("n_pro:" + n_pro);
        ;
    }
}

class OtherClass {
    static {
        Protection p1 = new Protection();

        // System.out.println(p1.n_pro);
        // System.out.println(p1.n_pri);
        // Can't access

        System.out.println(p1.n_pub);
    }
}
