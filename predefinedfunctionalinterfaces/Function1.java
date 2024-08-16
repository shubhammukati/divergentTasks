package predefinedfunctionalinterfaces;

import java.util.function.Function;

public class Function1 
{
    public static void main(String[] args) 
    {
        Function<Integer,Integer> f1 = (arg) -> arg*arg;
        int[] arr = {1,2,3,4,5};
        for(int elm : arr)
        {
            System.out.println("For Element  "+elm+" "+f1.apply(elm));
        }
    }

}
