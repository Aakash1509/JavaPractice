class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        MyEmployee e = new MyEmployee();
        e.setName("Aakash");
        e.setId(58);
        System.out.println("My name is "+e.getName());
        System.out.println("My id is "+e.getId());
    }
}
