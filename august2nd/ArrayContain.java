/*
 * Given an array containing positive elements. A and B are two numbers
 * Defining a range .
 * The task is to check if the array contains all elements in
 * the given range.
 * 
 * Example :- 
 *          N = 7 , A = 2, B = 5
 *          [1, 4, 5, 2, 7, 8, 3]
 *          answer = true bc 2 se 5 tak sare elements present hai array me 
 */
import java.util.ArrayList;
import java.util.Scanner;
class ArrayContain
{
    public static boolean checker(ArrayList<Integer>nums, int target)
    {
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)==target) return true;
        }
        return false;
    }

    public static boolean helper(ArrayList<Integer>nums, int start, int end)
    {
        while(start <= end)
        {
            if(!checker(nums,start)) return false;
            start++;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(5);
        nums.add(2);
        nums.add(7);
        nums.add(8);
        nums.add(3);
        System.out.println(helper(nums, start, end));

    }

}