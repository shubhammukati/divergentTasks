package predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.function.Function;


public class Function2 
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(90, "Manish"));
        students.add(new Student(40, "Karthik"));
        students.add(new Student(80, "Aksha"));
        students.add(new Student(70, "Samantha"));
        students.add(new Student(60, "Shyam"));
        students.add(new Student(95, "Shubham"));

        Function<Student,String> grade = (student) ->
        {
            int marks = student.marks;
            if(marks >= 90) return "Excellence";
            else if(marks <=89 && marks >=80) return "Good";
            else if(marks <=79 && marks >=70) return "Average";
            else return "Fail";
        };

        for(Student s : students)
        {
            Thread.sleep(3000);
            System.out.println(s.name +" :- "+grade.apply(s));
        }
        
    }

}
