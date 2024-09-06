public class Sleep extends Thread{
    public void run(){ //can't use throws here
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
    public static void main(String[] args) throws InterruptedException {
//        for(int i=1;i<=5;i++){
//            Thread.sleep(1000);
//            System.out.println(i);
//        }
        Sleep s1 = new Sleep();
        Sleep s2 = new Sleep();
        s1.start(); //If we do s1.run(),it will not create thread , main thread will simply call run method
        s2.start();

    }
}
