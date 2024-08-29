public class ExceptionPractice {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
//            System.out.println(e);
//            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am finally block");
        }
    }
}
