package predefinedfunctionalinterfaces;
import java.util.ArrayList;

public interface StudentArrayListFunction 
{

    public static ArrayList<Student> getarraylist()
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Shubham"));
        students.add(new Student(2, "Nidhi"));
        students.add(new Student(3, "Ishika"));
        students.add(new Student(4, "Akanshi"));
        students.add(new Student(5, "Lalu"));
        students.add(new Student(6, "Shyam"));
        return students;
    }
}
