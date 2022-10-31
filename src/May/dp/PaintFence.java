package May.dp;

public class PaintFence {
    public static void main(String[] args) {
        int  result= totalways(3 ,  2, 3)   ;
        System.out.println("Result: "+ result);
    }

   public static int  totalways(int n ,int  k,int con)
    {
        if (n <=0 || k<=0)
            return 1;
        System.out.println( " n= " +n + " k= "+k);
        return  totalways(n-1, k -1, con +1) + totalways(n, k-1, con +1) ;
    }
}
