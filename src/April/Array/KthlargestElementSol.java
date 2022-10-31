package April.Array;

import java.util.PriorityQueue;

public class KthlargestElementSol {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
                int  k = 2;
       int Result= findKthLargest(nums, k);

       System.out.println("Result:"+Result );

    }
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1-n2);

        for (int i=0; i<nums.length; i++)
        {
            heap.add(nums[i]);

            if(heap.size()>k)
                heap.poll();

        }
        return heap.poll();


    }
}
