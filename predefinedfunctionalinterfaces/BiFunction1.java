package predefinedfunctionalinterfaces;

import java.util.function.BiFunction;

public class BiFunction1 
{
    public static void main(String[] args) 
    {
        BiFunction<Integer, String, Student> biFunction = (marks,name) -> new Student(marks,name);
        Student s1 = biFunction.apply(12, "nidhi");
        System.out.println(s1.name+s1.marks);
    }

}
