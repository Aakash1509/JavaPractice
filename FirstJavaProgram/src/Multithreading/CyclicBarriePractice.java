package Multithreading;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarriePractice implements Runnable {
    private CyclicBarrier barrier;
    public CyclicBarriePractice(CyclicBarrier barrier){
        this.barrier=barrier;
    }
    @Override
    public void run() {
        while(true){
            try{
                barrier.await();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        CyclicBarrier barrier = new CyclicBarrier(3);
        executor.submit(new CyclicBarriePractice(barrier));
        executor.submit(new CyclicBarriePractice(barrier));
        executor.submit(new CyclicBarriePractice(barrier));
        Thread.sleep(2000);
        executor.shutdown();
        System.out.println("Completed");
    }
}
