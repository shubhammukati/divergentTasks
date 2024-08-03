import java.util.Scanner;

public class CountVowelCon 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                consonantCount++;
            }
        }

        System.out.println("VowelCount :- "+vowelCount);
        System.out.println("ConsonantCOunt :- "+consonantCount);
    }
    
}
