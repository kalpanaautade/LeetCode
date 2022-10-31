package April;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MakeValidParenthesesSol {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> rmChar= new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty())
                    stack.pop();
                else
                    rmChar.add(i);
            }
        }

        while(!stack.isEmpty())
            rmChar.add(stack.pop());

        String newString="";
        for (int i=0; i<s.length(); i++)
        {
            if(!rmChar.contains(i))
                newString +=s.charAt(i);
        }

        return newString;
    }

    public static void main(String[] args) {

    }
}
