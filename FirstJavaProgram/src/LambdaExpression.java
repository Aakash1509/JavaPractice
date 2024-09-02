@FunctionalInterface
interface Lambda{
    int show(int i,int j);
}
public class LambdaExpression {
    public static void main(String[] args) {
//        Lambda obj = () ->
//            {
//                System.out.println("in show");
//            };
//        Lambda obj = (int i) -> System.out.println("in show" + i); //If there is a single line , no need of {}

        Lambda obj = (i,j) -> i+j; //If there is a single line , no need of {},if it is a return statement no need to write return
        int result = obj.show(5,4);
        System.out.println(result);
    }
}
