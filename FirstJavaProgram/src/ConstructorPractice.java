class MyMainEmployee{
    private int id;
    private String name;
    /*
    public MyMainEmployee(){ //Automatically invoke
        id=45;
        name="Anonymous";
    }*/
    // Parameterized Constructor
    public MyMainEmployee(String myName){
        id=45;
        name=myName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class ConstructorPractice {
    public static void main(String[] args) {
        MyMainEmployee m = new MyMainEmployee("Aakash");
        System.out.println(m.getId());
        System.out.println(m.getName());
    }
}
