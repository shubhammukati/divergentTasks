package lambda;
import java.util.ArrayList;

class Employee
{
    public int salary;
    public String name;
    public int eid;

    Employee(int eid, String name,int salary)
    {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public String toString()
    {
        return "Employee Name: " + this.name +
                "\nEmployee Id: " + this.eid + 
                "\nEmployee Salary: " + this.salary;
    }

}

public class Lambda1 {
    public static void main(String[] args)
    {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(101,"Shubham",900000));
        arrayList.add(new Employee(102,"Akansha",600000));
        arrayList.add(new Employee(103,"Khushi",500000));
        arrayList.add(new Employee(104,"Pranay",700000));
        arrayList.add(new Employee(105,"Aadesh",10000));

        arrayList.sort((employee1,employe2)->
        {
            return employee1.name.compareTo(employe2.name);
        });
        System.out.println(arrayList);


    }
    
}

