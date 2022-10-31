package March;

public class RemoveDuplicateSol {

    public static int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        while(j< nums.length)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;

    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};

       int r= removeDuplicates(nums);

       System.out.println("Result Index:"+ r);


    }
}
