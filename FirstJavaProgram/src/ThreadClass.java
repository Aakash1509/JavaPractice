//Case-1 : Performing single task from single thread
public class ThreadClass extends Thread{
    public void run(){
        System.out.println("Thread task");
    }
    public static void main(String[] args) { //JVM creates main thread
        ThreadClass t = new ThreadClass();
        t.start();
    }
}
