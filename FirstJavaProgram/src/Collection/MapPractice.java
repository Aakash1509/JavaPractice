import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map mp = new HashMap();
        mp.put(101,"Aakash");
        mp.put(102,"Sky");
        mp.put(103,"Sky1");
//        mp.clear();
        System.out.println(mp.containsKey(103));
        System.out.println(mp.containsValue("Sky"));
        System.out.println(mp.get(102));
//        mp.remove(102);
        mp.replace(102,"Sky2");
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println("-----------");
        Set<Integer> keys = mp.keySet();
        for(int i : keys){
            System.out.println(i+ ":"+mp.get(i));
        }

    }
}
