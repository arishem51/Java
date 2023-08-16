package CurrentThreadDemo;

public class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread thread = Thread.currentThread();

        System.out.println("Current thread: " + thread);

        thread.setName("Arishemm Thread");
        System.out.println("Current thread: " + thread);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
