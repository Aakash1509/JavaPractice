package Multithreading;

import java.util.concurrent.*;

public class ThreadPool implements /*Runnable,*/Callable {
    String name;
    int num;
    ThreadPool(String name){
        this.name = name;
    }
    ThreadPool(int num){
        this.num=num;
    }
    /*
    @Override
    public void run() {
        System.out.println(name+"Job started by Thread"+Thread.currentThread().getName());
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){

        }
        System.out.println(name+"Job completed by Thread"+Thread.currentThread().getName());
    }

     */


    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"is responsible to find sum of first"+num+"numbers");
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(3);
        /* For Runnable interface

        ThreadPool[] jobs = {new ThreadPool("Aakash"),new ThreadPool("Sky"),
                new ThreadPool("adfvw"),new ThreadPool("bewtb"),new ThreadPool("Adbdfb"),new ThreadPool(" vefgeg")};

        for(ThreadPool job : jobs){
            service.submit(job);
        }
        service.shutdown();
         */
        ThreadPool[] jobs = {new ThreadPool(10),new ThreadPool(20),
                new ThreadPool(30),new ThreadPool(40),new ThreadPool(50),new ThreadPool(60)};
        for(ThreadPool job : jobs){
            Future f = service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }


}
