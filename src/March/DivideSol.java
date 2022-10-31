package March;

public class DivideSol {

    public static int divide(int dividend, int divisor) {

        // Special case: overflow.
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        /* We need to convert both numbers to negatives
         * for the reasons explained above.
         * Also, we count the number of negatives signs. */
        int negatives = 2;
        if (dividend > 0) {
            negatives--;
            dividend = -dividend;
        }
        if (divisor > 0) {
            negatives--;
            divisor = -divisor;
        }

        /* Count how many times the divisor has to be added
         * to get the dividend. This is the quotient. */
        int quotient = 0;
        while (dividend - divisor <= 0) {
            quotient--;
            dividend -= divisor;
        }

        /* If there was originally one negative sign, then
         * the quotient remains negative. Otherwise, switch
         * it to positive. */
        if (negatives != 1) {
            quotient = -quotient;
        }
        return quotient;
    }

    public static int divide_old(int dividend, int divisor) {
        int sign=1;
        int quotient=0;
        // Special case: overflow.
        if (dividend == Integer.MIN_VALUE &&  divisor == -1 )  {
            return Integer.MAX_VALUE;
        }
        if (dividend<0 &&  divisor<0)
        {
            dividend=-(dividend);
            divisor=-(divisor);
        }
        else if (dividend<0)
        {
            sign=-1;
            dividend=Math.negateExact(dividend);
        }
        else if (divisor<0)
        {
            sign=-1;
            divisor=-(divisor);
        }
        while(dividend>=divisor)
        {
            quotient +=1;
            dividend -=divisor;
        }

        if (sign==-1)
            quotient=-quotient;

        return quotient;
    }
    public static void main(String[] args) {

      int Result=  divide(-2147483648, -3);

      System.out.println("Result:" + Result );
    }
}
