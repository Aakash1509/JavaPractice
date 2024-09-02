//Iterator and ListIterator demo and at last Enumeration demo
import java.util.*;

public class CursorDemo {
    public static void main(String[] args) {
        /*
        List l = new ArrayList();
        l.add(10);
        l.add("Aakash");
        l.add(5.5f);

         */
//        System.out.println(l);
        /*Iterator
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
         */
        //List Iterator
        /*
        ListIterator itr1 = l.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("-------------");
        while(itr1.hasPrevious()){
            System.out.println(itr1.previous());
        }
         */
        Vector v = new Vector();
        v.add(10);
        v.add("Aakash");
        v.add("5.5f");
//        System.out.println(v);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
