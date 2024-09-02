class TotalEarnings extends Thread{
    int total=0;
    public void run(){
        synchronized (this){
            for(int i=0;i<=10;i++){
                total+=100;
            }
            this.notify();
        }
    }
}
public class InterThreadCommunication { //Synchronization is must to implement wait(),notify() and notifyAll()
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings t = new TotalEarnings();
        t.start();
        //System.out.println("Total Earnings : "+t.total);Without synchronization ,wait,notify it will display 0 as main thread will get executed
        synchronized (t){
            t.wait(); //main thread will go in waiting state
            //Action after this.notify is called
            System.out.println("Total Earnings : "+t.total);
        }
    }
}
