package May.Array.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddresses {

    public static boolean isValid(String str , int pos, String ans)
    {

        Integer num= Integer.parseInt(str);

        if (num >=0 && num<=255) {
            if (pos !=0 && str.charAt(0)=='0')
                return false;
            else
                return true;
        }
        else
            return false;
    }

    public static void select(String s, String ans, int pos, int curr,List<String> result )
    {
        if( pos>=4 && curr<s.length()-1)
            return;

        if (curr>=s.length())
        {
            String newstr=ans.substring(0,ans.length()-2);
            if(!result.contains(newstr))
                result.add(newstr);
            return;
        }

        if(pos==0) {
            String onedigit;
            if (curr+3>=s.length())
                onedigit = s.substring(curr);
            else
                onedigit = s.substring(curr, curr + 1);
            if(isValid(onedigit, pos, ans))
             select (s, ans+ onedigit+ ".", pos+1, curr+1,result );
        }

        String twodigit;
        if (curr+3>=s.length())
            twodigit = s.substring(curr);
        else
            twodigit = s.substring(curr, curr+2);
        if(isValid(twodigit, pos, ans))
            select (s, ans+ twodigit+ ".", pos+1, curr+2,result );

        String threedigit;
        if (curr+3>=s.length())
            threedigit = s.substring(curr);
        else
            threedigit = s.substring(curr, curr+3);
        if(isValid(threedigit, pos, ans))
            select (s, ans+ threedigit+ ".", pos+1, curr+3,result );


    }


    public static void restoreIpAddresses(String s) {

        List<String> result= new ArrayList<>();
        select (s, "", 0, 0,result );

        System.out.println(result);
    }
    public static void main(String[] args) {
        restoreIpAddresses("25525511135");
    }
}
