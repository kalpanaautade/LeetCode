package May.Array.recurrsion;

import java.util.*;
import java.util.stream.Collectors;

public class permutation {

    static List<List<Integer>> output = new ArrayList<List<Integer>>();
    static List<List<Integer>> ans= new ArrayList<List<Integer>>();
    public static void main(String[] args) {
       int[] nums = {1,2,3};
        // Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        List<List<Integer>> result= permute( nums);
       // findPermutation(nums ,0);
        System.out.println(output);
    }

        public static void backtrack(int n,
                              ArrayList<Integer> nums,
                              List<List<Integer>> output,
                              int first) {
            // if all integers are used up
            if (first == n)
                output.add(new ArrayList<Integer>(nums));
            for (int i = first; i < n; i++) {
                // place i-th integer first
                // in the current permutation
                Collections.swap(nums, first, i);
                // use next integers to complete the permutations
                backtrack(n, nums, output, first + 1);
                // backtrack
                Collections.swap(nums, first, i);
            }
        }




    public static void findPermutation(int[] nums , int idx)
    {
        if (idx>=nums.length)
            return;


        for (int i=0; i<nums.length;i++ )
        {
            int[] newcomb= new int[nums.length];
            newcomb=nums.clone();
            if (i!=idx)
            {
                int tmp = newcomb[idx];
                newcomb[idx]=  newcomb[i];
                newcomb[i]=tmp;
            }
            List<Integer> lst = Arrays.stream(newcomb).boxed().collect(Collectors.toList());

            if (!output.contains(lst))
                output.add(lst);


        }
        findPermutation( nums , idx+1);

    }

    public static List<List<Integer>> permute(int[] nums) {
            // init output list
            List<List<Integer>> output = new LinkedList();

            // convert nums into list since the output is a list of lists
            ArrayList<Integer> nums_lst = new ArrayList<Integer>();
            for (int num : nums)
                nums_lst.add(num);

            int n = nums.length;
            backtrack(n, nums_lst, output, 0);
            return output;
        }


}
