import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) throws InterruptedException {
        final WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait(); // 1- give back the intrinsic lock, 2 - wait for notify() to be called
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
             System.out.println("Waiting for return key");
             scanner.nextLine();
            // 1- does not give back the intrinsic lock,
            // 2- notify one thread which is waiting for the intrinsic lock of this object
             notify();
             Thread.sleep(5000);
        }
    }
}