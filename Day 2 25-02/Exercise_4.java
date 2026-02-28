package com.study;
//Write a class with main method to demonstrate instance creation using method reference.
//(Hint: Create any simple class with attributes and getters and setters.
@FunctionalInterface
interface IEmployeeFactory{
    Employee getEmployee(String name, String department);
};
class Employee{
    private String name;
    private String department;
    public Employee(String name, String department){
        this.name=name;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return "Employee is :"+ name + " and department is : " + department;
    }
}
public class Exercise_4 {
    public static void main(String[] args) {
        IEmployeeFactory factory= Employee::new;
        Employee emp1=factory.getEmployee("Alice", "Data Science");
        Employee emp2=factory.getEmployee("Robin", "Data Science");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

    }
}
