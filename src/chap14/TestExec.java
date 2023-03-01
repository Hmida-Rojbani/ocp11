package chap14;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class TestExec {
    static AtomicInteger count = new AtomicInteger(0);
    static void increment(){

        System.out.println(Thread.currentThread().getName()+"->"+ count.incrementAndGet());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            increment();
            increment();
            increment();
        });
        executorService2.execute(() -> {
            increment();
            increment();
            increment();
        });
        Future<?>  future =executorService.submit(() -> {
            increment();
            increment();
            increment();
        });
        executorService2.shutdownNow();
        Future<Integer>  future2 =executorService.submit(() -> {
            increment();
            increment();
            increment();
            return 1;
        });
        System.out.println(future.isDone());
        System.out.println(future2.isDone());
        System.out.println(future.get());
        System.out.println(future2.get());
        System.out.println(future.isDone());
        System.out.println(future2.isDone());

        executorService.shutdown();

    }
}
