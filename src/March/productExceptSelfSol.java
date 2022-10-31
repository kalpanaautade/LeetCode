package March;

public class productExceptSelfSol {

    public static int[] productExceptSelf(int[] nums) {

        int i=0;
        int[] result= new int[nums.length];
        int ignorSelf=0;
        int Product=1;
        while(ignorSelf<nums.length || i<nums.length)
        {
            if (i>= nums.length) {
                result[ignorSelf]=Product;
                Product= 1;
                ignorSelf++;
                i=0;
            }
            if(ignorSelf!=i )
                Product=Product* nums[i];
            i++;
        }
        return result;

    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] result= new int[nums.length];
        int prefix=1;
        int i=0;
        while( i<nums.length)
        {
            if (i==0) {
                prefix = 1;
                result[i]=prefix;
            }
            else
            {
             prefix = prefix *  nums[i-1];
             result[i]=prefix; }
            i++;
        }

        int j=nums.length-1;
        int suffix=1;

        while( j>=0)
        {
            if (j==nums.length-1) {
                suffix = 1;
                result[j]=result[j] * suffix;
            }
            else {
                suffix = suffix * nums[j + 1];
                result[j] = result[j] * suffix;
            }
            j--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[]  nums = {1,2,3,4};
      //  Input: nums = [1,2,3,4]
       // Output: [24,12,8,6]
        int[] result= productExceptSelf2( nums);

        for (int i=0; i<nums.length;i++)
            System.out.println(result[i] +" ");
    }
}
