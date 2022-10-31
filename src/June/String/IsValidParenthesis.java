package June.String;

import java.util.Stack;

public class IsValidParenthesis {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for (int i=0; i<s.length();i++)
        {
            Character curr=s.charAt(i);
            if (curr=='(' || curr=='{' || curr=='[')
                stack.push(curr);
            else
            {
                Character val=stack.pop();
                if ((curr==')' && val=='(')|| (curr==']' && val=='[') || (curr=='}' && val=='{'))
                    continue;
                else
                    return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        boolean result=isValid("()[]{}");
        System.out.println("Result: "+result );
    }
}
