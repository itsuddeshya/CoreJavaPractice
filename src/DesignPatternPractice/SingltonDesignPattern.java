package DesignPatternPractice;

public class SingltonDesignPattern {

             /*Approach 1 we are creating object at starting and returning same object whenever called */

//    private static SingltonDesignPattern singltonDesignPattern =new SingltonDesignPattern(); //private static variable, create object 1st time
//    private SingltonDesignPattern(){}       //private constructor
//    public static SingltonDesignPattern getSingltonDesignPattern(){
//            return singltonDesignPattern;}

            /*Approach 2- Here we are creating object at starting,
                when there is no object created means null and then
                after that we are sharing same object*/

    private static SingltonDesignPattern singlton;
    private SingltonDesignPattern() {}
    public static SingltonDesignPattern getSingltonDesignPattern() {
        if(singlton==null){
            singlton=new SingltonDesignPattern();
        }
        return singlton;
    }
}

