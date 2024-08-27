import java.lang.String;
public class StringPractice {
    public static void main(String[] args) {

        // == for address comparison , .equals() for content comparison
        /*
        String s1 = new String("Aakash");
        String s2 = new String("Aakash");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true

        String s3 = "Vadodara";
        String s4 = "Vadodara";
        System.out.println(s3==s4); //true
         */
        StringBuffer sb = new StringBuffer(); //Mutable strings
        System.out.println(sb.capacity()); // can store 16 characters
        StringBuffer sb1 = new StringBuffer("Aakash");
        System.out.println(sb1.capacity()); // 16 + string length
        StringBuffer sb3 = new StringBuffer(1000);
        System.out.println(sb3.capacity()); //1000

    }
}
