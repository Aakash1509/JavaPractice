class Animal{
    public void eat(){
        System.out.println("I am Eating");
    }
}
public class InheritancePractice extends Animal {
    public static void main(String[] args) {
        InheritancePractice obj = new InheritancePractice();
        obj.eat();
    }
}
