package March;

public class plusOneSol {
    public static int[] plusOne(int[] digits) {
        int borrow=0;
        for(int i=digits.length-1; i>=0 ; i--)
        {
            int Sum=0;
            Sum= digits[i] + 1;

            if(Sum > 9)
            {
                digits[i]=0;
            }
            else {
                digits[i] = Sum;
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
   }
    public static void main(String[] args) {
        int[] digits={9,9,9};
        int[] result=  plusOne(digits);

        for (int i=0; i< result.length; i++ )
            System.out.print(result[i] + ", ");
    }
}
