package April.Array;

public class MaxSubArraySol {

    public static int maxSubArray2(int[] num) {
        int maxSum=num[0];
        int sum=num[0];
        for (int i = 1; i < num.length; i++) {
          if (num[i] > num[i]+sum) {
              sum=Math.max(num[i], num[i]+sum);
          }
          else {
              sum += num[i];
              maxSum= Math.max(maxSum, sum);
          }
        }
        return maxSum;
    }
    public static int maxSubArray1(int[] num) {
        int maxSum=0;
        for (int i = 0; i < num.length; i++) {
            int sumSub=0;
            for (int j=i; j<num.length; j++) {
                sumSub+=num[j];
                maxSum= Math.max(maxSum,sumSub )   ;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};



        int result =maxSubArray2( nums);

        System.out.println("Result : "+result);
        /*
          Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
            Output: 6
          Explanation: [4,-1,2,1] has the largest sum = 6.
        */
    }
}
