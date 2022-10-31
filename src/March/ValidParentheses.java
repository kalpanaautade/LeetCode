package March;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        boolean isValidParentheses=isValid("(){[()]})()()");

        System.out.println("Valid Parentheses :"+isValidParentheses);
    }
    public static boolean isValid(String s) {
     HashMap<Character, Character> mappings;
        mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack= new Stack<Character>();
     for(int i=0; i<s.length(); i++)
     {
         Character ch=s.charAt(i);
         if (mappings.containsKey(ch))
         {
             if(!stack.isEmpty()) {
                 Character topchar = stack.pop();
                 if (mappings.get(ch) != topchar)
                     return false;
             }
             else
             return  false;
         }
         else
         {
             stack.push(ch);
         }
     }
        if(stack.isEmpty())
            return true;
        else
            return  false;
    }
}
