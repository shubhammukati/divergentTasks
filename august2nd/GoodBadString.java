
public class GoodBadString {
    public static boolean goodString(String s)
    {
        String vowels = "aeiou";
        int countvowels = 0;
        int countconsonants = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(vowels.contains(String.valueOf(ch)))
            {
                countvowels++;
                countconsonants = 0;
            }
            else if(ch == '?')
            {
                countvowels++;
                countconsonants++;
            }
            else{
                countconsonants++;
                countvowels = 0;
            }
            
            if(countconsonants>3 || countvowels>5) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s = "bcdaeiou";
        System.out.println(goodString(s));
    }
}
