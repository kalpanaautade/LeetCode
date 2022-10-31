package July.Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubSeqSol {

     public static List<String> getSS(String ss)
     {
         if(ss.length()==0)
         {
             List lst =new ArrayList<>();
             lst.add("");
             return lst;

         }
         String ch = String.valueOf(ss.charAt(0));
         String ros=ss.substring(1);
         List<String> res= getSS(ros);
         List<String> mres =new ArrayList<>();

         for(String str: res)
         {
             mres.add(""+str);
             mres.add(ch+str);
         }
         return mres;

     }
    public static void main(String[] args) {
         String ss="abcd";
        List<String> res=getSS(ss);
        for(String str: res)
            System.out.println(str);
    }
}
