package predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
    public String ename;
    public int salary;
    public String city;

    public Employee(String name, String city, int salary)
    {
        this.ename = name;
        this.city = city;
        this.salary = salary;
    }
}

public class Predicate2 
{
    public static void main(String[] args) 
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nidhi", "Dubai", 300000));
        employees.add(new Employee("Shubham", "Kasrawad", 800000));
        employees.add(new Employee("Lalu", "Balsamud", 223000));
        employees.add(new Employee("Shyam", "Lohari", 200020));
        employees.add(new Employee("Aksha", "banglore", 500000));
        employees.add(new Employee("Pranay", "INdore", 700000));

        
        Predicate<Employee> checker = (employee) -> employee.salary >= 300000;
        for(Employee employee : employees)
        {
            if(checker.test(employee)) System.out.println(employee.ename +" Accepted");
        }
    }

}
