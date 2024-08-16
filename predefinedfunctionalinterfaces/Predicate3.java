package predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class Predicate3 
{
    public static void main(String[] args)
    {
        int[] arr = {10, 3, 5, 45, 45, 42, 65, 25, 23, 80};
        Predicate<Integer> p1 = (arg) -> { return arg%2==0; };
        Predicate<Integer> p2 = (arg) -> { return arg>30; };
        int countAccept = 0;
        int countReject = 0;
        for(int element : arr)
        {

            if(p1.or(p2).test(element))
            {
                countAccept++;
            }
            else{
                countReject++;
            }
        }
        System.out.println(countAccept+" Accepted");
        System.out.println(countReject+ " Rejected");
    }

}
