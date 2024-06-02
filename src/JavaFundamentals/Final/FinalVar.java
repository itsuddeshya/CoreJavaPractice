package JavaFundamentals.Final;

public class FinalVar {
    public static void main(String[] args) {

        final int fvar=5;   //it can be assigned only once and can not be changed.
        Parclass p1 = new Parclass();
        p1.f();
//        Childclass ch = new Childclass();
//        ch.f();
    }
}
 final class Parclass{   //This class can not be extended
     final void f(){     //Final method this can not be overriddin on child class
         System.out.println("final method");
    }
}
//class Childclass extends Parclass{
//    Parclass parclass=new Parclass();
////    @Override
////    void f(){
////        System.out.println("Overridded");
////    }
//}


