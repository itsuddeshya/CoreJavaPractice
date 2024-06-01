package DesignPatternPractice.FactoryDP;

public class DeveloperClint {
    public static void main(String[] args) {
        Employee employee=EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee);
        System.out.println(employee.getSalary());

    }
}
/* Factory method is a way to create object in java without coupling clint code to concreate classses.
When there is super class and multiple subclasses, and we want to create object of subclass based on i/p & requirement
not by new keyword. We create a factory class in this case and create object of each class rquivallent to keyword,

and from clint class/main class we can access same object using i/p keyword without new ketword.
Here we are not creating object using new keyword , here we are creating object based on input.

It provide loose coupling and more robust code.

* */