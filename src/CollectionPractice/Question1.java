/*Write a Program to Insert Employee Objects into the TreeSet where DNSO is Based on
Ascending Order of EmployeeId and Customized Sorting Order is Based on Alphabetical Order of Names */

package CollectionPractice;
import java.util.Comparator;
import java.util.TreeSet;

public class Question1 {
    public static void main(String[] args) {
        Employee e1 =new Employee("Raj",14);
        Employee e2 =new Employee("Uddeshya",164);
        Employee e3 =new Employee("Singh",12);
        Employee e4 =new Employee("pal",130);
        //TreeSet t =new TreeSet(new EmployeeComparator());
        EmployeeComparator employeeComparator=new EmployeeComparator();
        TreeSet t =new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        System.out.println("Ascending Order by EmpId :"+t);
        TreeSet t1 =new TreeSet(employeeComparator);
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        System.out.println("Ascending Order by Empname :"+t1);
    }
}
class Employee implements Comparable<Employee>{
    private Integer EmployeeId;
    private String EmployeeName;

    public Employee( String employeeName,Integer employeeId) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        if(this.getEmployeeId()>o.getEmployeeId()) return 1;
        else if(this.getEmployeeId()<o.getEmployeeId()) return -1;
        else return 0;
    }
}
class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int i1 = o1.getEmployeeName().length();
        int i2 = o2.getEmployeeName().length();
        if(i1<i2) return -1;
        else if ((i1>i2)) return 1;
        else if(o1.getEmployeeId()> o2.getEmployeeId())return +1;  //if name length is same we need to compare by id
        else if (o1.getEmployeeId()< o2.getEmployeeId()) return -1;
        else return 0;
    }
}

