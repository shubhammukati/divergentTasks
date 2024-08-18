/*
 ? write a program to find length of the given string without using a 
 ? build in functions or methods
 */

public class LengthOfString 
{
    public static int lenOfString(String str)
    {
        char[] chararray = str.toCharArray();
        int len = 0;
        for(char c: chararray) System.out.println(c);len++;
        return len;
    }

    public static void main(String[] args)
    {
        String str = "shubham mukati";
        System.out.println(lenOfString(str));

    }
    
}
