enum Laptop{
//    Running, Failed, Pending, Success; when class name was Status
    Macbook(2000),Lenovo(1500),ThinkPad(1000),Dell(3000);
    private int price;
    private Laptop(int price) { //It should be private so that no new instance is created outside the class
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum {
    public static void main(String[] args) {
        /*
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal()); //Prints index

        Status[] ss = Status.values();
        for(Status z : ss){
            System.out.println(z + " " + z.ordinal());
        }
         */
        /*
        Status s = Status.Pending;

        switch(s){ //Not need to mention type in switch as it knows it is of type
                    //Status but in if-else you ned to write if(s==Status.pending)
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
        }
         */
        //Laptop lap = Laptop.Macbook;
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " " + lap.getPrice());
        }
    }
}
