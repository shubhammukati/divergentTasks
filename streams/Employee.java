package streams;

import java.util.ArrayList;

public class Employee 
{
    public String name;
    public int eid;
    public int salary;
    public String city;

    public Employee(String name, int eid, int salary, String city)
    {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
        this.city = city;
    }

    public String toString()
    {
        return "[ "+this.eid+" "+this.name+" "+this.salary+" "+this.city+" ]";
    }

    public static ArrayList<Employee> getEmployees()
    {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Shubham", 101, 100000, "DUBAI"));
        arrayList.add(new Employee("Lalu", 102, 200000, "LOS ANGELES"));
        arrayList.add(new Employee("Shyam", 104, 300000, "SINGAPORE"));
        arrayList.add(new Employee("Arya", 105, 100000, "AGRA"));
        arrayList.add(new Employee("DHeeraj", 106, 600000, "DELHI"));
        arrayList.add(new Employee("Ayushi", 107, 700000, "MANIPUR"));
        arrayList.add(new Employee("Vishnu", 108, 900000, "MUMBAI"));
        arrayList.add(new Employee("Palak", 109, 300000, "SURAT"));
        return arrayList;
    }


}
