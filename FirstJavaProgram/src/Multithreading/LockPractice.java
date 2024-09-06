package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//When we create lock we not use synchronized methods

class BankAccount{
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw"+amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    System.out.println(Thread.currentThread().getName()+"proceeding with withdrawal");
                    try{
                        Thread.sleep(3000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName() + "..completed withdrawal. Remaining balance : "+balance);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    finally {
                        lock.unlock();
                    }

                }
                else{
                    System.out.println(Thread.currentThread().getName()+"Insufficient balance");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+"could not acquire the lock,will try later");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
public class LockPractice {
}
