package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int cap){
        q=new LinkedList<>();
        capacity=cap;
    }
    public boolean add(int item) throws InterruptedException {
        synchronized (q){
            while(q.size()==capacity){
                q.wait(); //Suppose if 2 threads were waiting , therefore use while loop
            }
            q.add(item);
            q.notifyAll(); //Will notify the waiting threads that now item can be consumed
            return true;
        }
    }
    public int remove() throws InterruptedException {
        synchronized (q){
            while(q.size()==0){
                q.wait(); //Wait till producer produces an item
            }
            int element = q.poll();
            q.notifyAll();
            return element;

        }
    }
}
