package April.String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesisSol {

    static List<String> answer=new ArrayList<String>();

        private static void backtrack(String inter, List<String> answer, int open , int close , int max)
        {
            if (inter.length()==max*2)
            {
                answer.add(inter);
                inter="";

            }
            if(open<max)
            {
                inter+="(";
                backtrack( inter,  answer,  open+1 ,  close ,  max);
                inter = inter.substring(0, inter.length()-1);
            }
            if(close<open)
            {
                inter+=")";
                backtrack( inter,  answer,  open ,  close+1 ,  max);
                inter = inter.substring(0, inter.length()-1);
            }
        }

        public static List<String> generateParenthesis(int n) {
            backtrack("" , answer, 0,0,n);
            return answer;
        }

    public static void main(String[] args) {
        List<String>  result= generateParenthesis(3);

        for(int i=0; i<result.size(); i++)
        {
            System.out.println(result.get(i));
        }
    }

}
