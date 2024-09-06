import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

//for-each is part of Java Iterable
public class CollectionPractice {
    static final int i =10;
    static public void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        LocalDate d = LocalDate.of(2003, Month.SEPTEMBER,15);
        LocalTime d = LocalTime.now();
        System.out.println(d);
        System.out.println(args.length);
        String[] arr = new String[3];
        System.out.println(arr[0]);
        byte b = 127;

//        b = (b+1)(byte);
        System.out.println(++b); //Byte is a circular data type
        Boolean b1 = Boolean.valueOf("tRue");
        Boolean b2 = Boolean.valueOf("fAlsE");
        Boolean b3 = Boolean.valueOf("abc");
        Boolean b4 = null;
        System.out.println(b1+" "+b2+" "+b3+" "+b4);
        /*
        final boolean flag=false;
        while(flag){ //Compile-time error
            System.out.println("Hello");
        }
        */
        String one = "1";
        one.concat("2");
        System.out.println(one);

        final CollectionPractice obj = null;
        System.out.println(obj.i);

        try {
            String a = "hello";
            throw new Error("out of memory");
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        /*
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        for( String element : list ){
            System.out.println(element);
        }

         */

        /*
        Set<String> setA = new HashSet<>();

        setA.add("element 1");
        setA.add("element 2");
        setA.add("element 3");

        Iterator<String> iterator = setA.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

         */
        /*
        TreeSet<Integer> treeSet = new TreeSet();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        //If Integer is not mentioned it will take it as object and you need to typecast
        Iterator<Integer> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

         */
        /*
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }

         */
    }
}
