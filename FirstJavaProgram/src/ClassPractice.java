class Employee{ //There can be only 1 public class in a java file
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is : "+id+" and my name is : "+name);
    }
}
public class ClassPractice {
    public void eat(){
        System.out.println("I am eating");
    }
    public static void main(String[] args) {
        ClassPractice c = new ClassPractice();
        Employee aakash = new Employee(); //Instantiating object
//        c.eat();
        aakash.id=58;
        aakash.name = "My name is Aakash";
        aakash.printDetails();
    }
}
