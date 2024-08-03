import java.util.ArrayList;
public class LargestSmallest
{
    public static int largestElement(ArrayList<Integer>nums)
    {
        int largest = -999999;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)>largest)
            {
                largest = nums.get(i);
            }
        }
        return largest;
    }

    public static int smallestElement(ArrayList<Integer>nums)
    {
        int smallest = 1000000;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i) < smallest)
            {
                smallest = nums.get(i);
            }
        }
        return smallest;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(19);
        nums.add(2);
        nums.add(43);
        nums.add(343);
        nums.add(6);
        nums.add(-1);
        nums.add(98);
        System.out.println("Largest :- "+largestElement(nums));
        System.out.println("Smallest :- "+smallestElement(nums));
    }
    
}
