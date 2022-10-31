package May.dp;

public class HouseRobberII {

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int result= rob(nums);
        System.out.println("Result"+result );

    }
        public static int rob(int[] nums) {
            int N=nums.length;
            int[] dp = new int[N];

            dp[0]= nums[0];
            dp[1]=Math.max( dp[0], nums[1]);

            for(int i=2; i<N; i++)
            {
                dp[i]=Math.max(nums[i]+dp[i-2], dp[i-1]);
            }
            return dp[N-1];

        }

}
