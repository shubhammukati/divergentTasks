// check whether the given strings are anagrams or not 
import java.util.HashMap;
import java.util.Map;

public class Areanagram
{
    public static boolean areAnagram(String str1, String str2)
    {
        if(str1.length()!=str2.length()) return false;
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            char c = str1.charAt(i);
            mpp.put(c, mpp.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<str2.length();i++)
        {
            char c = str2.charAt(i);
            mpp.put(c, mpp.getOrDefault(c, 0)-1);
        }

        for(Map.Entry<Character,Integer> entry : mpp.entrySet())
        {
            if(entry.getValue()!=0) return false;
        }
        
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "silent";
        String str2 = "listen";

        System.out.println(areAnagram(str1, str2));
    }
}