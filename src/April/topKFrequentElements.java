package April;

import java.util.*;

public class topKFrequentElements {

    public static void main(String[] args) {
        int[]  nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result=topKFrequent(nums, 2);

        for(int i=0; i<result.length; i++)
            System.out.println(result[i] + ", ");
    }


    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();
        List<Integer> lst= new ArrayList<Integer>();

        for(int i =0; i< nums.length; i++)
        {
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>((n1,n2)-> map.get(n1) -map.get(n2));

        for(int n: map.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;

    }
}
