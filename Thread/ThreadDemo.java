package Thread;

class Counter {
    private int count = 0;

    public synchronized void incrementSync() {
        count++;
    }

    public void increment() {
        count++;
    }

    public synchronized int getCount() {
        System.out.println("Current count: " + this.count);
        return count;
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        var counter = new Counter();
        var t1 = new Thread(() -> {
            counter.incrementSync();
            System.out.println("Thread 1: " + counter.getCount());
        });
        var t2 = new Thread(() -> {
            counter.incrementSync();
            System.out.println("Thread 2: " + counter.getCount());
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        counter.incrementSync();
        System.out.println("Main thread: " + counter.getCount());
    }
}
