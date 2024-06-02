package Questions;

/*Question1- Find out all methods ,constructor, variable of any predefined classes(e.g- String Class).*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class FindClassMembers {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c =Class.forName("java.lang.String");
        Method[] methods =c.getDeclaredMethods();               //All methods in this Array
        Constructor[] constructors=c.getConstructors();
        System.out.println("Methods Count in String Class :"+ methods.length);
        System.out.println("Constructors Count in String Class :"+ constructors.length);
    }
}

