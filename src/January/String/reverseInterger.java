package January.String;

public class reverseInterger {

    public static int reverse(int x) {


        int rev=0;
        while(x>0)
        {
            rev=rev*10 + x%10;
            x/=10;
        }
        if (rev <= Integer.MIN_VALUE || rev >= Integer.MAX_VALUE )
            return 0;
        else
            return rev;
    }

    public static void main(String[] args) {
       int result= reverse(2147483647);

       System.out.println("Result: "+ result);

    }
}
