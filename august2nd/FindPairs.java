import java.util.ArrayList;
public class FindPairs {

    public static int getPairs(ArrayList<Integer> nums, int target)
    {
        int countpairs = 0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i)+nums.get(j)==target)
                {
                    countpairs++;
                }
            }
        }
        return countpairs;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(7);
        nums.add(1);
        System.out.println(getPairs(nums, 6));
    }
    
}
