class A{
    int a = 10;
}
public class SuperKeyword extends A{
    int a=20;
    void show(int i){
        System.out.println(i);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        SuperKeyword s = new SuperKeyword();
        s.show(30);
    }
}
