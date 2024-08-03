/*
 * Given two Integers N and M
 * The problem is to find the number closest to N and divisible by M
 * If there are more than one such numbers 
 * then output the one having maximum absolute value
 ? Example :- 
            N = 13 , M = 4
            o/p = 12
 */

import java.util.Scanner;

public class FindClosest 
{
    public static int findClosest(int N, int M)
    {
        // we are checking in the both directions backword and forward
        if(N%M==0)return N;
        int forward = N;
        int backword = N;

        while(true)
        {
            if(forward%M==0) return forward;
            forward++;
            if(backword%M==0) return backword;
            backword--;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Value of N :- ");
        int N = scanner.nextInt();
        System.out.println("Enter the Value Of M :- ");
        int M = scanner.nextInt();
        scanner.close();

        System.out.println("Result is :- "+findClosest(N, M));
        
    }
    
}
