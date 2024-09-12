import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPractice {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(4,5,6,7,8);
        //1st way
        System.out.println("1st Way");
        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(cons);

        //2nd way
        System.out.println("2nd Way");
        nums.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //3rd Way
        System.out.println("3rd Way");
        /*
         Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(cons);*/
        //OR
//        cons = (n) -> System.out.println(n);


        nums.forEach((n) -> System.out.println(n));


    }
}
