package CollectionPractice;

import java.util.*;

public class comparableMain {
    public static void main(String[] args) {
        Student s1 =new Student(12,"Raj");
        Student s2 =new Student(9,"Singh");
        Student s3 =new Student(43,"Pal");
        Student s4 =new Student(21,"Uddeshyaraj");
        List t = new ArrayList();
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        System.out.println(t);
        Collections.sort(t);
        System.out.println("By comparable: "+t);
        Collections.sort(t,new StudentComparator());
        System.out.println("By comparator: "+t);
    }
}
class Student implements Comparable<Student>{

    private Integer rollNo;
    private String Name;

    public Student(Integer rollNo, String name) {
        this.rollNo = rollNo;
        Name = name;
    }
    public Integer getRollNo() {
        return rollNo;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setRollNo(Integer rollNo,String name) {
        this.rollNo = rollNo;
        this.Name =Name;
    }
    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", Name='" + Name + '\'' + '}';
    }
    @Override
//    public int compareTo(Student o) {
//        if(this.getRollNo()>o.getRollNo()) return -1;
//            else if (this.getRollNo()<o.getRollNo()) return 1;
//            else return 0;
//    }
    public int compareTo(Student o) {
        int i1 = this.getName().length();
        int i2 = o.getName().length();
        if(i1>i2) return -1;
        else if (i1<i2) return 1;
        else return 0;
    }
}
class StudentComparator implements Comparator<Student>{ // here we are not changing sstudent class
    @Override
    public int compare(Student o1, Student o2) {
        int i1 = o1.getName().length();
        int i2 = o2.getName().length();
        if(i1>i2) return -1;
        else if (i1<i2) return 1;
        else return 0;
    }
}


