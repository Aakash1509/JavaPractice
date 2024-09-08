package Multithreading;

public class VolatileExample implements Runnable{
    //If I don't use volatile value the thread will not get updated value of stopRequested and it will keep running while loop infinitely
    private static volatile boolean stopRequested; //By default value false
    @Override
    public void run() {
        int i=0;
        while(!stopRequested){
            i++;
        }
        System.out.println("background thread completed");
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileExample v = new VolatileExample();
        Thread t = new Thread(v);
        t.start();
        Thread.sleep(1000);
        stopRequested = true;
        System.out.println("Main completed");
    }
    //Even though the stopRequested variable is updated by the main thread after a delay, without the volatile keyword, the background thread (run method) may not see the updated value immediately or ever. This is due to how thread caching and memory visibility work in Java.


}
