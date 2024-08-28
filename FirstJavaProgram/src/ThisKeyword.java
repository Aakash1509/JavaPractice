class Test1{
    int i;
    void setValue(int i){
        this.i=i;   //Without using this it will take 0(default value)
    }
    void show(){
        System.out.println(i);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setValue(10);
        t.show();
    }
}
