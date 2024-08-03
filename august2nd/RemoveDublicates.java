import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDublicates {
    
    public static TreeSet<Integer> removeDublicates(ArrayList<Integer>nums)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.size();i++)
        {
            set.add(nums.get(i));
        }
        return set;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(5);
        nums.add(2);
        nums.add(8);

        TreeSet<Integer>set = removeDublicates(nums);
        for(Integer element : set)
        {
            System.out.print(element+" ");
        }

    }
}
