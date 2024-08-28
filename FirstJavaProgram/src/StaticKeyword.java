class Test2{
    static int b=5;
}
public class StaticKeyword {
    static int a = 10;
    static int count=0;
    StaticKeyword(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        //static int b = 20; Not valid as it is a local variable
        System.out.println(Test2.b); //Will execute,no need to create object or extend

        //Using static keyword to implement a counter
        StaticKeyword o1 = new StaticKeyword();
        StaticKeyword o2 = new StaticKeyword();
        StaticKeyword o3 = new StaticKeyword();
    }
}
