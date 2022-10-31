package April;

import java.util.PriorityQueue;

public class findKLargestElementSol{

        public static int findKthLargest(int[] nums, int k) {
            // init heap 'the smallest element first'
            PriorityQueue<Integer> heap =
                    new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

            // keep k largest elements in the heap
            for (int n: nums) {
                heap.add(n);
                if (heap.size() > k)
                    heap.poll();
            }

            // output
            return heap.poll();
        }


    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int  k = 2;

       int result= findKthLargest(nums, k);

       System.out.println("Result: " +result);

    }
}
