import java.util.Stack;

class MaxStack {

Stack<Integer> stack = new Stack<Integer>();

    public MaxStack() {

    }

    public void push(int x) {
        stack.push(x);

    }

    public int pop() {
        if (!stack.isEmpty())
        {
            int x= stack.pop();
            return x;
        }
        else return -1;


    }

    public int top() {
        if (!stack.isEmpty())
        {
            int x= stack.lastElement();
            return x;
        }
        else return -1;


    }

    public int peekMax() {

        int max=0;
        if (!stack.isEmpty())
        {
            for (int i= stack.size()-1; i>=0; i--)
            {
                int result= stack.get(i);
                if (result>max)
                    max=result;
            }
            return max;
        }
        else return -1;



    }

    public int popMax() {
        int max=0;
        int index=0;
        if (!stack.isEmpty())
        {
            for (int i= stack.size()-1; i>=0; i--)
            {
                int result= stack.get(i);
                if (result>=max)
                    index=i;
                    max=result;
            }
        }
        else return -1;
         Integer top=stack.remove(index);
        return  top;
    }
}

