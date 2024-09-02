public class ThreadPriority extends Thread {
    public void run(){
        System.out.println("Child thread");
        System.out.println("Child thread priority "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
//        System.out.println("Main thread priority "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println("Main thread priority "+Thread.currentThread().getPriority());
        ThreadPriority t = new ThreadPriority();
        ThreadPriority t1 = new ThreadPriority();
        t1.setPriority(2);
        t1.start();
        t.setPriority(3);
        t.start();
        //System.out.println();
    }
}
