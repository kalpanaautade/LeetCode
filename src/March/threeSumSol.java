package March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumSol {

    public static void main(String[] args)
    {
        int[] nums={0,0,0};
        List<List<Integer>> result= threeSum(nums);

        for (int i=0; i<result.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result.get(i).get(j) + " ,");
            }

            System.out.println(" ");
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> resultlst = new ArrayList<>();
        int i=0;
        while (i<nums.length && nums[i]<=0) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                int l = i + 1;
                int h = nums.length - 1;
                while (l < h) {
                    int sum = nums[i] + nums[l] + nums[h];
                    if (sum == 0) {
                        resultlst.add(Arrays.asList(nums[i], nums[l], nums[h]));
                        l++;
                        h--;
                    } else if (sum < 0)
                        l++;
                    else if (sum > 0)
                        h--;
                }
            }
            i++;
        }
        return resultlst;
    }
}
