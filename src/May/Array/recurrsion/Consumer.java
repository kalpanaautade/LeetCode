package May.Array.recurrsion;

import java.util.List;

public class Consumer extends  Thread {
    List<Integer>  queue;
    Integer count;
    public Consumer(List<Integer> lst, Integer count1)
    {
        queue=lst;
        count=count1;
    }

    public void run()
    {
        while (true)
        {
            try {
                printodd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public   void  printodd() throws InterruptedException {
        synchronized(this) {
            while (count % 2 == 0)
                wait();
            {
                count = count + 1;
                System.out.println(" Print Odd Count " + count);
                notify();
            }
        }

    }
}
