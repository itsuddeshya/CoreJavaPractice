package excecptionHandlingPractice;

public class Excecption_throw {
    public static void main(String[] args) {
        System.out.println("before calling f1");
        f1();
        System.out.println("After calling f1");
    }
    public static void f1(){
        System.out.println("before calling f2");
        f2();
        System.out.println("After calling f2");

    }
    public static void f2() {
        System.out.println("before rising exception");
//        throw new RuntimeException("/by zero"); //to rise customize exception
    }
}
        /*Customized Exception Creation*/


