public class MethodsPractice {
    static int logic(int x,int y){ //static thi static method j call karay (object vagar)
        int z;
        if(x>y){
            z=x*y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    static void foo(){
        System.out.println("Without Parameters");
    }
    static void foo(int a){
        System.out.println("Good afternoon "+a+" bro!");
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c = logic(a,b);
        System.out.println(c);

        //Method Overloading
        //Overloading can't be performed by changing return type
        foo();
        foo(300); //Argument
    }
}
