package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchPractice implements Runnable{
    private CountDownLatch latch;
    public CountDownLatchPractice(CountDownLatch latch){
        this.latch=latch;
    }
    @Override
    public void run() {
        latch.countDown(); //Decrements the count of thread by 1
    }
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(4);
        CountDownLatch latch = new CountDownLatch(3);
        executor.submit(new CountDownLatchPractice(latch));
        executor.submit(new CountDownLatchPractice(latch));
        executor.submit(new CountDownLatchPractice(latch));
        latch.await();
        System.out.println("All dependent services initiated");
        executor.shutdown();
    }


}
