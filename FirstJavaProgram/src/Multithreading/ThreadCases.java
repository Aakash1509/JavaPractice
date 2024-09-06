//Case-3 : Performing multiple tasks from multiple threads
class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}

//Case-2 : Performing single task from multiple threads
public class ThreadCases extends Thread {
    public void run(){
        System.out.println("Single task");
    }
    public static void main(String[] args) {
        /*
        ThreadCases t1 = new ThreadCases();
        t1.start();
        ThreadCases t2 = new ThreadCases();
        t2.start();

         */
        for(int i=0;i<=100;i++){
            MyThread1 t1 = new MyThread1();
            MyThread2 t2 = new MyThread2();
            t1.start();
            t2.start();
        }
        /*
        for(int i=0;i<=100;i++){
//            MyThread2 t2 = new MyThread2();
//            t2.start();
        }

         */


    }
}
