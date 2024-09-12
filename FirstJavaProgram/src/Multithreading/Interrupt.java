package Multithreading;

public class Interrupt extends Thread {
    public void run(){ //can't use throws here
        try {
            for(int i=1;i<=5;i++){
                System.out.println("child thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            System.out.println("Thread interrupted "+e);
        }
    }
    public static void main(String[] args) {
        Interrupt i = new Interrupt();
        i.start();
        i.interrupt(); //If Thread.sleep(1000) is commented out,this call is of no use as for interruption thread needs to go in sleep state
    }
}
