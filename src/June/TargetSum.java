package June;

public class TargetSum {
    static int  ans=0;
    public static void backtrack(int idx , int sum, int[] nums, int target )
    {
        if(idx >= nums.length)
        {
            if (sum==target)
                ans++;
            return;
        }

        backtrack(idx + 1, sum + nums[idx], nums, target);
        backtrack(idx + 1, sum - nums[idx], nums, target);

    }
    public static int findTargetSumWays(int[] nums, int target) {
        backtrack(0 ,  0,  nums, target);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int ans= findTargetSumWays( nums,  target);
        System.out.println("Ans"+ ans);
    }
}
