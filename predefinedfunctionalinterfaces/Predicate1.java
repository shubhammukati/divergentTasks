package predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class Predicate1 
{
    public static void main(String[] args) 
    {
        String[] sarray = {"shubham", "nidhi", "khushi", "akansha"};
        Predicate<String> checker = arg -> arg.length()>5;
        for(String s : sarray)
        {
            if(checker.test(s)) System.out.println(s);
        }
        
    }

}
