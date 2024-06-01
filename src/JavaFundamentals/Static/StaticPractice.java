package JavaFundamentals.Static;

public class StaticPractice {
     void m1(){
        System.out.println(" Instance method1 called");
    }
    static  void  m2()
    {
        System.out.println(" Static method2 called");
    }

    public static void main(String[] args) {
         m2();
         StaticPractice staticPractice=new StaticPractice();
         staticPractice.m1();
    }
}
