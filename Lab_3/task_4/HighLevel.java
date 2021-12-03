package task_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevel {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(()->Calculator.sum(2,4));
        executor.submit(()->Calculator.subtraction(7,3));
        executor.submit(()->Calculator.multiplication(4,5));

        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }
    }
}
