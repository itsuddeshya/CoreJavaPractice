package excecptionHandlingPractice;

public class Excecption_try_catch {
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
        System.out.println("before rising excecption");
     // System.out.println(10/0);
            /*Handling exp by try catch block*/
        try{
            System.out.println("Before occuring excep in try block");
            System.out.println(10/0 );
            System.out.println("after occuring excep in try block");
        }
        catch (ArithmeticException arithmeticException)
//        catch (ArrayIndexOutOfBoundsException arithmeticException)      //class not the type of excep,catch block not execute.
        {
            System.out.println("Excecption handled in catch block");
            System.out.println(arithmeticException.getMessage());

        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("After excecption handleing");

    }
}
