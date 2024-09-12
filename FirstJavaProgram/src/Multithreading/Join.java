package Multithreading;

public class Join extends Thread {
    static Thread mainthread;
    public void run(){ //can't use throws here
        try {
            mainthread.join(); //Will execute after main thread completes its execution
        for(int i=1;i<=5;i++){
                System.out.println("child thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        mainthread = Thread.currentThread(); //reference of main thread
        Join j = new Join();
        j.start();
//        j.join();
        try {
            for(int i=1;i<=5;i++){
                System.out.println("main thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
