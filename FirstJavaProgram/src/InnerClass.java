class A1{
    int a = 10;
    public void show(){
        System.out.println("In show of class A1");
    }
    class B1{
        public void config(){
            System.out.println("In config of class B1");
        }
    }

}
public class InnerClass {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();
        //Static can be only used with inner class and not outer class
        A1.B1 obj1 = obj.new B1(); //To create object of B1 you need to create object of A1
        obj1.config();
        //When inner class is static
        //A1.B1 obj1 = new A1.B1();
    }
}
