package January.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        List<Integer> L1 = new ArrayList<Integer>();

        for (int i=0; i< nums.length; i++)
            for (int j=i+1; j< nums.length; j++)
                if (nums[i]+ nums[j]==target) {
                    L1.add(i);
                    L1.add(j);
                }
       return L1.stream().mapToInt(i->i ).toArray();
    }
    public static void main(String[] args) {
        int[] nums={3, 2, 4};
        int[] results= twoSum(nums, 6);
        Arrays.stream(results).forEach(System.out::println);

    }
}
