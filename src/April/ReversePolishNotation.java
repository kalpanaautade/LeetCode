package April;

import java.util.Stack;

public class ReversePolishNotation {

    public static boolean isNumeric(String val)
    {
        try
        {   Double.parseDouble(val);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i< tokens.length ; i++ )
        {
            if (isNumeric(tokens[i]))
                stack.push(Integer.parseInt(tokens[i]));
            else if (!stack.isEmpty() && stack.size()>1 )
            {
                int operand1= stack.pop();
                int operand2= stack.pop();
                int val= calculate(operand2, operand1,tokens[i] );
                stack.push(val);
            }
        }
        if (!stack.isEmpty())
            return  stack.pop();
        else
            return 0;

    }

    private static int calculate(int val1, int val2, String op)
    {
        switch(op)
        {
            case "+" :
                return val1+val2;

            case "-" :
                return val1-val2;

            case "*" :
                return val1*val2;

            case "/" :
                return val1/val2;
        }
        return 0;
    }

    public static void main(String[] args) {

        String[] tokens={"4","13","5","/","+"};
        int Result= evalRPN(tokens);

        System.out.println("Result:-" +Result);

    }
}
