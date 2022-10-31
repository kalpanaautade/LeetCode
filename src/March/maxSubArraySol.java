package March;

public class maxSubArraySol {

    public static void main(String[] args) {

      //  int[] nums={ -2,1,-3,4,-1,2,1,-5,4};
        int[] nums={ -3,-2,-2,-3};

        int result=maxSubArray(nums);

        System.out.println("Result: "+result);
    }
    public static int maxSubArray(int[] num) {

        int result =bestSumArray(num, 0, num.length-1);

        return result;
    }

    public static int bestSumArray(int[] nums,int left, int right)
    {
        if(left>right)
            return Integer.MIN_VALUE;

        int mid=Math.floorDiv((left+right),2);

        int currSum=0; int bestSum=0;
        int bestleft=0, bestright=0;
        for ( int i=mid-1; i>=left; i--)
        {
            currSum += nums[i];
            bestleft=Math.max(bestleft, currSum);
        }
        currSum=0;
        for ( int i=mid+1; i<=right; i++)
        {
            currSum += nums[i];
            bestright=Math.max(bestright, currSum);
        }

        bestSum =nums[mid] + bestleft +bestright;
        int leftbest= bestSumArray( nums, left, mid-1);
        int rightbest= bestSumArray(  nums, mid+1, right);

        return Math.max(bestSum, Math.max(leftbest,rightbest));

    }

}
