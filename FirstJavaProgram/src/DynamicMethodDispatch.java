class AA {
    void show(){
        System.out.println("A show");
    }
}
class BB extends AA{
    void show(){
        System.out.println("B show");
    }
}
class CC extends AA{
    void show(){
        System.out.println("C show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        AA obj = new AA();
        obj.show();

        obj = new BB();
        obj.show();

        obj = new CC();
        obj.show();
    }
}
