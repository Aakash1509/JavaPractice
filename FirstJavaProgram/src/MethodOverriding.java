class Test{
    public void show(){
        System.out.println(1);
    }
}
public class MethodOverriding extends Test{
    public void show(){
        //super.show(); Will call method of parent class
        System.out.println(2);
    }
    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.show(); //2
        Test t = new Test();
        t.show(); //1
    }
}
