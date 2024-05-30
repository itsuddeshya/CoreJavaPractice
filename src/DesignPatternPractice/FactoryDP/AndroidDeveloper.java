package DesignPatternPractice.FactoryDP;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Android Developer Salary ");
        return 50000;
    }
}
class WebDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Web Developer Salary ");
        return 55000;
    }
}
