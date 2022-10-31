package April.String;

import java.util.ArrayList;
import java.util.List;

public class DecodeWaysSol {
    public static int numDecodings(String s) {

        int ansCount=0;
        List<Integer> digits = new ArrayList<Integer>();
        Backtrack(s, 0,1, s.length(), ansCount, 0 , digits);

        return ansCount;
    }

    private static void Backtrack(String s, int level,  int charlen, int max, int ansCount , int sum, List<Integer> digits)
    {

        if(sum == max)
        {
            for(int k=0; k<digits.size(); k++)
            {
                if(!( digits.get(k)>=0 && digits.get(k)<=26))
                {
                    digits= new ArrayList<Integer>();
                    return;
                }
            }
            ansCount ++;
            digits= new ArrayList<Integer>();
        }

        for ( charlen=1; charlen<=2 ; charlen++ ) {
            if (level < s.length()) {
                sum = sum + charlen;
                digits.add(Integer.parseInt(s.substring(level, (level + charlen ))));
                Backtrack(s, level + 1, charlen, max, ansCount, sum, digits);
            }
        }



    }

    public static void main(String[] args) {

        int count=numDecodings("12");
        System.out.println("Result:"+count );
    }
}
