package May.Array.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class subset {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<List<Integer>> result= permute( nums);

        System.out.println(result);

    }
       static List<List<Integer>> ans= new ArrayList<List<Integer>>();

        public static List<List<Integer>> permute(int[] nums) {

            backtracking( nums,new ArrayList(),0);
            return ans;

        }

        public static void backtracking(int[] nums, List<Integer> lst, int idx)
        {
            if(idx>=nums.length){
                return; }

            if (ans.size()==0)
            {
                List<Integer> newlst = new ArrayList<>();
                ans.add(newlst);
            }
            List<Integer> newlst = new ArrayList<>();
            for (Integer item: lst)
                newlst.add(item);
            newlst.add(nums[idx]);
            ans.add(newlst);
            backtracking( nums , newlst, idx+1);
            backtracking( nums , lst, idx+1);

        }


}
