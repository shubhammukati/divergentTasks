package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 
{
    public static void main(String[] args) 
    {
        ArrayList<Employee> arrayList = Employee.getEmployees();
        List<Employee> l1 = arrayList.stream().filter(e->e.salary<300000).collect(Collectors.toList());
        System.out.println();
        l1.stream().forEach(System.out::println);
        
    }
}
