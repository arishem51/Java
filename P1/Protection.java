package P1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Protection");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pub = " + n_pub);

    }
}
