package predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionChaining 
{

    public static void main(String[] args) 
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Shubham"));
        students.add(new Student(2, "Nidhi"));
        students.add(new Student(3, "Ishika"));
        students.add(new Student(4, "Akanshi"));
        students.add(new Student(5, "Lalu"));
        students.add(new Student(6, "Shyam"));

        Function<Student,Integer> f1 = (student) -> student.marks*2;
        Function<Integer,Integer> f2 = (arg) -> (int)arg/2;
        // Function<Integer,Integer> f3 = (arg) -> arg+2;

        for(Student element : students)
        {
            int a = f2.compose(f1).apply(element);
            System.out.println("after modification "+ element.name+": - "+a);
        }

        
    }

}
