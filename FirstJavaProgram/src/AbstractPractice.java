abstract class Vehicle{
    abstract public void start();
}
public class AbstractPractice extends Vehicle{
    public void start(){
        System.out.println("This is called by overriding abstract method");
    }
    public static void main(String[] args) {
        AbstractPractice p = new AbstractPractice();
        p.start();
    }
}
