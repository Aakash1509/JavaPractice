package Collection;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class ConcurrentHashMapPractice extends Thread{
    static ConcurrentHashMap m = new ConcurrentHashMap(); //If I use HashMap it will throw error ConcurrentModificationException
    public void run(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Child Thread Updating Map");
        m.put(103,"C");
    }
    public static void main(String[] args) throws InterruptedException {
        /*
        ConcurrentHashMap mp = new ConcurrentHashMap();
        mp.put(101,"A");
        mp.put(102,"B");
        mp.putIfAbsent(103,"C");
        mp.putIfAbsent(101,"D");
        mp.remove(101,"D");
        mp.replace(102,"B","E");
        System.out.println(mp); //Output : {101=A, 102=E, 103=C}

         */
        m.put(101,"A");
        m.put(102,"B");

        ConcurrentHashMapPractice t = new ConcurrentHashMapPractice();
        t.start();
        Set s1 = m.keySet();
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Integer I1 = (Integer)itr.next();
            m.put(104,"D");
            System.out.println("Main thread iterating Map and current entry is:"+I1+"..."+m.get(I1));
            Thread.sleep(3000);
        }
        System.out.println(m);


    }
}
