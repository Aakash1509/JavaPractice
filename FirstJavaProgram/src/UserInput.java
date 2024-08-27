import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        /*
        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is:"+sum);
         */
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day!");


    }
}
