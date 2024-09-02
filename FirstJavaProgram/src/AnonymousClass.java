class Example{ //If class is abstract still it will work
    public void show(){
        System.out.println("In show");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Example e = new Example(){
            @Override
            public void show() {
                System.out.println("Show of anonymous class");
            }
        };
        e.show(); //This will print show of anonymous class , used when we want to use it only once

    }
}
