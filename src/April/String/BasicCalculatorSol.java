package April.String;

import java.util.Stack;

public class BasicCalculatorSol {
    private static boolean isNumeric(String s)
    {
        try
        {
            Double.parseDouble(s);
            return true;
        }
        catch(Exception ex)
        {
            return false;

        }
    }
    public static int calculate(String s) {
        String val1="";
        String val2="";
        String Oprator="";
        Stack<String> stack = new  Stack<String>();
        int i=0;
        String currentdigit="";
        boolean isMultiplytop =false;
        while( i<s.length())
        {
            char currentChar=s.charAt(i);
            if (!Character.isWhitespace(currentChar))
            {
                //Handle Empty Space
                if (isNumeric(Character.toString(currentChar)))
                {
                    if(!stack.isEmpty() && (stack.peek().equals("*") || stack.peek().equals("/") ))
                    {
                        isMultiplytop=true;
                    }
                    stack.push(Character.toString(currentChar));
                }
                else
                {
                    val1="";
                    val2="";
                    Oprator="";
                    if (isMultiplytop)
                    {
                        while(!stack.isEmpty() && isNumeric(stack.peek()))
                        {
                            val1= stack.pop() + val1;
                        }
                        Oprator=stack.pop();
                        while(!stack.isEmpty() || isNumeric(stack.peek()) )
                        {
                            val2= stack.pop() + val1;
                        }
                        isMultiplytop=false;

                        int ans= Eval(Integer.parseInt(val1) ,Integer.parseInt(val2), Oprator);
                        stack.push(String.valueOf(ans));
                    }
                    stack.push(Character.toString(currentChar));
                }
            }
            i++;
        }

        int finalans=0;
        while(!stack.isEmpty() )
        {
            val1="";
            val2="";
            System.out.println("stack.peek():"+stack.peek());
            while( !stack.isEmpty()  && finalans==0 && isNumeric(stack.peek()))
            {
                val2= stack.pop() + val2;
            }
            Oprator=stack.pop();
            while(!stack.isEmpty() && isNumeric(stack.peek()) )
            {
                val1= stack.pop() + val1;
            }
            isMultiplytop=false;
            if(val1.isEmpty())
                val1="0";
            if(val2.isEmpty())
                val2="0";
            if(!Oprator.isEmpty()) {
                if (finalans == 0)

                    finalans = Eval(Integer.parseInt(val1), Integer.parseInt(val2), Oprator);
                else
                    finalans = Eval(finalans, Integer.parseInt(val1), Oprator);
            }



        }
        return finalans;
    }


    private static int Eval(int val1 , int val2 , String op)
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
        int Result= calculate("1+1-1");

        System.out.println("Result:"+ Result);
    }
}
