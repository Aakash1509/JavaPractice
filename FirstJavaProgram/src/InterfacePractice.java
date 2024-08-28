interface I1{
    void start(); //by default public abstract
//    static void display(){ can create static,default methods
//
//    }
    int a = 10; //by default public static final
}
interface I2{
    void display();
}
public class InterfacePractice implements I1,I2{
    public void start(){ //necessary to write public as it is default by default
        System.out.println("start");
    }
    public void display(){
        System.out.println("display");
    }
    public static void main(String[] args) {
        InterfacePractice p = new InterfacePractice();
        p.start();
        p.display();
    }
}
