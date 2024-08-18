package predefinedfunctionalinterfaces;

import java.util.function.Consumer;

public class Consumer1 
{
    public static void main(String[] args) 
    {

        Consumer<Student> consumer = (student) ->
        {
            System.out.println();
            System.out.println("Student Name  :- "+student.name);
            System.out.println("Student Marks :- "+student.marks);  
        };

        for(Student s : StudentArrayListFunction.getarraylist())
        {
            consumer.accept(s);
        }
        
    }
}
