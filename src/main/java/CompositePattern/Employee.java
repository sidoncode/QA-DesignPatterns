package CompositePattern;

import java.util.List;

public class Employee {

    private String name;
    private String dept;
    private int Salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept,int sal){
        this.name = name;
        this.dept = dept;
        this.Salary = sal;
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee: [ Name: "+ name + "dept: " + dept + " Salary: "
                + Salary + " ]");
    }


}