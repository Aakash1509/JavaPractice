package Multithreading;

public class Yield extends Thread {
    public void run(){
//        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
    public static void main(String[] args) {
        Yield y = new Yield();
        y.start();
        Thread.yield(); //If you want main method to stop execution and provide other threads chance to execute
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }


    }
}
