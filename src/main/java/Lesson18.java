import java.util.Scanner;

public class Lesson18 {
    public static void main(String[] args) {
        MyThread18 myThread18 = new MyThread18();
        myThread18.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread18.shutdown();
    }
}

class MyThread18 extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}
