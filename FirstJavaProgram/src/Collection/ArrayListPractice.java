import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Aakash");
        al.add(5.5);

        ArrayList all = new ArrayList();
        all.add(120);
        all.add("deepak");
        al.addAll(all);
        System.out.println(al);
        al.removeAll(all);
        System.out.println(al);
        System.out.println(al.size());
        al.set(1,"Sky");
        System.out.println(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
