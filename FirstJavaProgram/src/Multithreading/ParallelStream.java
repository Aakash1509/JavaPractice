package Multithreading;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        /*
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.range(1,1000).forEach(n-> System.out.println(n));
//        IntStream.range(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Time taken by single stream "+(end-start));

        System.out.println("================");

        start = System.currentTimeMillis();
        IntStream.range(1,1000).parallel().forEach(n-> System.out.println(n));
        end = System.currentTimeMillis();
        System.out.println("Time taken by parallel stream "+(end-start));

         */
        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread "+Thread.currentThread().getName()+" : "+x);
        });
        System.out.println("========================");
        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread "+Thread.currentThread().getName()+" : "+x);
        });

    }
}
