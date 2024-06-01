package JavaFundamentals.Abstract;

public class AbstractMain {
    public static void main(String[] args) {
//        AbstractParent abstractParent = new AbstractParent();   We can not create object of abstract class.

        AbstractChild abstractChild = new AbstractChild();
        abstractChild.m1();
    }
}
