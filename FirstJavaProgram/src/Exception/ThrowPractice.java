import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class ThrowPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        try{
            if(age<18){
                throw new YoungerAgeException("You are not eligible to vote");
            }
            else{
                System.out.println("You can vote successfully");
            }
        } catch (YoungerAgeException e) {
            e.printStackTrace();
        }
        //If we not use try-catch block this hello won't execute
        System.out.println("hello");
    }
}
