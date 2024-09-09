package Multithreading;

public class RunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
//        RunnableInterface r = new RunnableInterface(); //Both are same
        Thread t = new Thread(new RunnableInterface());
        t.start();
    }
}
