package May.Array.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class numsSameConsecDiffSol {

    public static List<Integer> numsSameConsecDiff(int n, int k) {
        List<Integer> result=new ArrayList();
        for (int i=1; i<=9; i++)
            calculate(i,  n ,  k ,  i,  1,result );

        return result;
    }

    public static void calculate(int start, int n , int k , int ans, int currpos, List<Integer> lst)
    {
        if (currpos>=n)
        {
            lst.add(ans);
            return;
        }
        int num=-1;
        if (start+k <=9 )
        {
            num=start+k;
            ans=ans*10 + num;
            calculate(num,  n ,  k ,  ans,  currpos+1, lst);
            ans=ans/10;
        }

        if (start-k >=0)
        {
            num=start-k;
            ans=ans*10 + num;
            calculate(num,  n ,  k ,  ans,  currpos+1, lst);
            ans=ans/10;
        }

    }

    public static void main(String[] args) {
        List<Integer> result= numsSameConsecDiff(3, 7);
        System.out.println(result);

    }
}
