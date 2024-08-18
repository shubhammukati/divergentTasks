package predefinedfunctionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumer1 
{
    public static void main(String[] args) 
    {
        BiConsumer<Student,Integer> biConsumer = (student,marksadd) -> {student.marks+=marksadd;};
        for(Student student : StudentArrayListFunction.getarraylist())
        {
            biConsumer.accept(student, 1000);
        }
        for(Student student : StudentArrayListFunction.getarraylist())
        {
            System.out.println(student.marks);
        }
        
    }

}
