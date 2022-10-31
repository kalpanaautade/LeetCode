package April.dp;

import java.util.Arrays;

public class coinChangeSol {
    public static  int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for (int i=1;i<=amount; i++)
        {  for(int num:coins)
        {
            if (num<=i)
            {
                dp[i]= Math.min(dp[i], dp[i-num] +1) ;
            }
        }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5} ;
       int amount = 11;

       int Result= coinChange(coins, amount);
    }
}
