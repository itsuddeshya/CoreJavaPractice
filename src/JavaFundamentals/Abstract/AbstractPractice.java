package JavaFundamentals.Abstract;

abstract class AbstractParent {
//    AbstractPractice abstractPractice=new AbstractPractice(); //It shows compile time error as we are not allowed to make object of Anstract class
    public abstract void m1();      //Abstract method ,method without body
}
        /* Extend abstract class and it must override every abstract method of abstract class*/
class AbstractChild extends AbstractParent{
    @Override
    public void m1() {
        System.out.println("Abstract method called");
    }
}
