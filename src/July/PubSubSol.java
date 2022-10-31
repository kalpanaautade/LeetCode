package July;

import java.util.LinkedList;

public class PubSubSol {


    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<Integer>();
        publisher pubobj = new publisher(lst, 10);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pubobj.produce();
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pubobj.consumer();
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class publisher
{
    LinkedList<Integer> lst ;
    int capacity=0;

    public publisher(LinkedList<Integer> lst, int capacity) {
        this.lst = lst;
        this.capacity = capacity;
    }

    public void produce() throws InterruptedException {
        int val=0;
        while(true)
        {
            synchronized (this)
            {
                if (lst.size() >= capacity)
                    wait();
                lst.add(val);
                System.out.println("Produced val:" + val);
                val++;
                notify();
            }
        }
    }

    public void consumer() throws InterruptedException {

        while (true)
        {
            synchronized (this)
            {
                if(lst.size()==0)
                    wait();

                int val=lst.removeFirst();
                System.out.println("Consumed val:" + val);
                    notify();
            }
        }
    }
}
