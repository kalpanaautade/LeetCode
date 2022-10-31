package April.Array;

public class MaxStockProfit {


    public static int maxProfit(int[] prices) {

        int maxProfit=0;
        int MinIndex=0;
        Integer minval, maxval;

        minval =Integer.MAX_VALUE;
        maxval = Integer.MIN_VALUE;
        for (int i=0; i<prices.length  ; i++)
        {
            if (prices[i]<minval )
            {
                minval=prices[i];
                MinIndex=i;
                for(int j= prices.length -1  ; j>MinIndex ; j--)
                {
                    if (prices[j]>maxval )
                        maxval=prices[j];
                }
                if (  minval!=Integer.MAX_VALUE && maxval!=Integer.MIN_VALUE)
                {
                    maxProfit=Math.max( maxProfit,maxval- minval);
                    minval =Integer.MAX_VALUE;
                    maxval = Integer.MIN_VALUE;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        //int[] prices= {7,6,4,3,1};
         int[] prices= {2,4,1};
     int Result=   maxProfit(prices);

    }
}
