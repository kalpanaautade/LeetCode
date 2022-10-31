package April.Array;

import java.util.ArrayList;
import java.util.List;

public class MaxOperations {


        public static int maxOperations(int[] nums, int k) {

            List<Integer> arr =new ArrayList();
            for(int i=0; i< nums.length; i++)
                arr.add(nums[i]);

            List<Integer> result= new ArrayList<Integer>();
            int count=0;
            for(int i=0; i< nums.length; i++)
            {
                int nextNum=k-nums[i];
                if(arr.contains(nextNum))
                {
                    if (!result.isEmpty() && (result.contains(nums[i]) || result.contains(nextNum)))
                        continue;
                    count++;
                    result.add(nums[i]);
                    result.add(nextNum);
                }
            }

            return count;

        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        int count= maxOperations( nums, k);

        System.out.println("Count:"+ count);
    }
}
