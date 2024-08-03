/*
 ! WAP to merge two sorted arrays into one sorted array
 [1,2,4,0,0,0]
 [2,3,4]
 */

import java.util.ArrayList;

public class MergeArray  
{
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer>nums1, ArrayList<Integer>nums2)
    {
        ArrayList<Integer>nums3 = new ArrayList<>();
         
        int left1 = 0;
        int left2 = 0;
        
        while(left1<nums1.size() && left2<nums2.size())
        {
            if(nums1.get(left1) < nums2.get(left2))
            {
                nums3.add(nums1.get(left1));
                left1++;
            }
            
            else
            {
                nums3.add(nums2.get(left2));
                left2++;
            }
        }

        while(left1 < nums1.size())
        {
            nums3.add(nums1.get(left1));
            left1++;
        }

        while(left2 < nums2.size())
        {
            nums3.add(nums2.get(left2));
            left2++;
        }

        return nums3;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(4);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        ArrayList<Integer>result = mergeSorted(nums1, nums2);
        for(int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }

    }
    
}
