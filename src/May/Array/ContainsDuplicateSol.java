package May.Array;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateSol {
    public static boolean containsNearbyDuplicate(int[] nums, int k)
    {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if (!map.containsKey(nums[i]))
                map.put(nums[i],i );
            else
            {
                if (i- map.get(nums[i]) <= k)
                    return true;
                else {
                    map.put(nums[i],i );
                    continue;
                }
            }
        }
        return false;

    }


    public static void main(String[] args) {
        int[]  nums = {1,0,1,1};
                int  k = 1;
        boolean result= containsNearbyDuplicate( nums,  k);

        System.out.println("Result:"+ result);
    }
}
