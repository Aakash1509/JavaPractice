public class RunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
        RunnableInterface r = new RunnableInterface();
        Thread t = new Thread(r);
        t.start();
    }
}
