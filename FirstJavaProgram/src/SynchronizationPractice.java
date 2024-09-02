class BookTheaterSeat{
    int total_seats=10;
    void bookSeat(int seats){
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        synchronized (this){
            if(total_seats>=seats){
                System.out.println(seats+" seats booked successfully");
                total_seats=total_seats-seats;
                System.out.println("Seats left : "+total_seats);
            }
            else{
                System.out.println("Sorry seats cannot be booked...!!");
                System.out.println("Seats left : "+total_seats);
            }
        }
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
    }
}
public class SynchronizationPractice extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b= new BookTheaterSeat();
        SynchronizationPractice s = new SynchronizationPractice();
        s.seats=7;
        s.start();

        SynchronizationPractice s1 = new SynchronizationPractice();
        s1.seats=6;
        s1.start();



    }
}
