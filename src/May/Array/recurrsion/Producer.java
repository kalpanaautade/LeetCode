package May.Array.recurrsion;

import java.util.List;

public class Producer extends  Thread {
    List<Integer>  queue;
    Integer count;
    public Producer(List<Integer> lst , Integer count1)
    {
        queue=lst;
        count= count1;
    }
    public void run()
    {
        while (true)
        {
          try {
                printeven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
     public  void  printeven() throws InterruptedException {
         synchronized(this) {
             while (count % 2 == 1)
                 wait();
             {
                 count = count + 1;
                 System.out.println(" Produced Count " + count);
                 notify();
             }
         }
     }

}
