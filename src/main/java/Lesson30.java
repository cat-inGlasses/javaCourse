import java.util.Random;
import java.util.concurrent.*;

public class Lesson30 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt(10);

            if(randomValue < 5) {
                throw new Exception("Something bad happened");
            }

            return randomValue;
        });

        executorService.shutdown();

        try {
            int result = future.get(); // get() waits till thread will be finished
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
//            e.printStackTrace();
        }

    }

    public static int calculate() {
        return 5 + 4;
    }
}
