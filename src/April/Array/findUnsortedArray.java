package April.Array;

public class findUnsortedArray {

        //left =1;
        //right= 5
        public static int findUnsortedSubarray(int[] nums) {

            int left =0;
            int right =nums.length-1;
            int len=nums.length;
            int min=0;
            int max=0;

            boolean flag=false;
            while (left < len-1)
            {
                for (int j=left +1 ; j<=len-1; j++)
                if (nums[left]> nums[j] )
                {
                    min=nums[left];
                    flag=true;
                    break;
                }
                if (flag==true)
                    break;
                left++;
            }

            flag=false;
            while (right > 0)
            {
                for (int j=right-1 ; j>=0; j--)
                if(nums[right]< nums[j] )
                {
                    max=nums[right];
                    flag=true;
                    break;
                }
                if (flag==true)
                    break;;
                right--;
            }

            int l=0;
            int r=0;
            for ( l=0; l<len; l++ )
                if (nums[l]==min)
                    break;
            for (r=len-1; r>=0; r--)
                if (nums[r]==max)
                    break;

            if (l < r)
                return r-l+1;
            else
                return 0;

        }

    public static void main(String[] args) {

        int[] nums={2,6,4,8,10,9,15};
        int index=findUnsortedSubarray(nums);
        System.out.println("Result" + index);


    }

}
