package excecptionHandlingPractice;

public class CustomizedException {
    public static void main(String[] args) {
        System.out.println("before calling f1");
        f1();
        System.out.println("After calling f1");
    }
    public static void f1() {
        System.out.println("before rising exception");
        MinimumBalanceException minimumBalanceException=new MinimumBalanceException("Account have min bal");
        throw minimumBalanceException;  //This can be handeled by try catch if needed.
    }
}
        /*Customized Exception Creation*/
class MinimumBalanceException extends RuntimeException{
    MinimumBalanceException(String msg){
        super(msg);
    }
}
