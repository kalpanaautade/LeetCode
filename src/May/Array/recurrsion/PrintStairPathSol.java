package May.Array.recurrsion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PrintStairPathSol {

   static List<Integer> que= new LinkedList<>();



    public static void main(String[] args) {

        Integer count=0;
        Thread producer = new Producer(que, count);
        producer.start();

        Thread consumer = new Consumer(que, count);
        consumer.start();

    }



}
