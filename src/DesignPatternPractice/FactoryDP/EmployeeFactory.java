package DesignPatternPractice.FactoryDP;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if(empType.equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        }

        return null;
    }
}
