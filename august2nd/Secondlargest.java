import java.util.ArrayList;
public class Secondlargest 
{
    public static int secondLargest(ArrayList<Integer>nums)
    {
        int largest = nums.get(0);
        int slargest = 0;

        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)>largest)
            {
                slargest = largest;
                largest = nums.get(i);
            }

            else if(nums.get(i) > slargest && nums.get(i) < largest)
            {
                slargest = nums.get(i);
            }
        }
        return slargest;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(234);
        nums.add(56);
        nums.add(76);
        nums.add(56);
        nums.add(456);
        nums.add(444);
        System.out.println(secondLargest(nums));
    }
    
}
