package CurrentThreadDemo;

interface SleepObj {
    int SleepTimeChildThread = 1000;
    int SleepTimeMainThread = SleepTimeChildThread * 10;
}

class NewThread implements Runnable, SleepObj {
    String name;
    Thread t;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("New Thread" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(SleepTimeChildThread);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class MultipleThreads implements SleepObj {
    public static void main(String args[]) {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");

        try {
            Thread.sleep(SleepTimeMainThread);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
        System.out.println(t1.name + ": " + t1.t.isAlive());
        System.out.println(t2.name + ": " + t2.t.isAlive());
        System.out.println(t3.name + ": " + t3.t.isAlive());

    }
}
