package March;

import java.util.ArrayList;
import java.util.List;

public class isHappySol {

    public static Integer getSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int remainder= n%10;
            n=n/10;
            sum+=remainder*remainder;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        List<Integer> lst = new ArrayList<Integer>();

        while (!lst.contains(n) && n != 1) {
            lst.add(n);
            n = getSum(n);
        }
        if (n==1) return true;
        else return false;
    }

    public static void main(String[] args) {

      boolean result=  isHappy(2);

      System.out.println("Is Happy Number:"+result);
    }
}
