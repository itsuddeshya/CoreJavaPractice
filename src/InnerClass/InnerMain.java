package InnerClass;

import java.util.HashMap;
import java.util.Map;

public class InnerMain {
    public static void main(String[] args) {


        /*calling outer class(University) properties*/
        University university=new University();
        university.setUniId(1);
        university.setUniName("Delhi University");
        System.out.println(university);
        /*Without outer class object inner class can not be used*/

        /*calling inner class(Department) properties*/
        University.Department department =university.new Department();
        department.setDepID(2);
        department.setDepName("Engineering");
        System.out.println(department);

    }
}
