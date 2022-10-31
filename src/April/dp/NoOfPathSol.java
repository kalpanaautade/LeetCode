package April.dp;

public class NoOfPathSol {

    static int helper(int i, int j , int n )
    {
        if ( i < 0 || j < 0  )
            return 0;
        int num2=0;
        int num1 = helper(i-1, j, n)  +1 ;
        if (i>j)
         num2 = helper(i, j - 1, n) +1 ;

        return num1+num2;
    }


    static int numOfPathsToDest(int n) {
        if(n == 0)
            return 0;
        return helper(n-1, n-1, n);
    }

    public static void main(String[] args) {

      int Result=  numOfPathsToDest(4);
      System.out.println("Result:"+ Result);


    }

}