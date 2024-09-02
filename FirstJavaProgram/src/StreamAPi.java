import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPi {
    public static void main(String[] args) {
        //Stream can be only used one time
        //Can perform expressions using Stream with Lambda expression
        List<Integer> nums = Arrays.asList(3,4,5,6);
        System.out.println(nums);
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n-> System.out.println(n));
        Stream<Integer> s2 = nums.stream().filter(n->n%2==0);
        s2.forEach(n-> System.out.println(n));
        Stream<Integer> s3 = nums.stream().map(n->n*2);
        int result = nums.stream().reduce(0,(c,e)->c+e);
        s3.forEach(n-> System.out.println(n));
        System.out.println(result);
    }
}
