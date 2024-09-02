public class DaemonThread extends Thread{
    public void run(){
        System.out.println("Daemon Thread");
        System.out.println(Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        System.out.println("Main thread");//If it is commented out , nothing will be printed
        DaemonThread t = new DaemonThread();
        t.setDaemon(true); //It will be before start method
        t.start();


    }
}
