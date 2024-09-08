package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample implements Runnable{
    private final AtomicInteger count = new AtomicInteger();
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
//                Thread.sleep(1000);
                count.getAndIncrement();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
    public int getCount(){
        return count.get();
    }
    public static void main(String[] args) throws Exception{
        AtomicExample a = new AtomicExample();
        Thread t = new Thread(a);
        t.start();
        Thread t1 = new Thread(a);
        t1.start();
        t.join();
        t1.join();
        System.out.println("Count"+a.getCount());
    }


}
