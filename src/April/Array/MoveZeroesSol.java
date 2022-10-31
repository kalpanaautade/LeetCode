package April.Array;

public class MoveZeroesSol {
    public static void moveZeroes(int[] nums) {
        int m=0;
        int k=1;
        int i, j;
        while(m<nums.length )
        {
            for ( i=m;  i<nums.length; i++ )
            {
                if(nums[i]==0)
                    break;
            }
            if(nums[i]==0) {
                for (j = i+1; j < nums.length; j++) {
                    if (nums[j] > 0)
                        break;
                }
                if ( j < nums.length) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                else
                    break;
                m = i + 1;

            }
        }
    }

    public static void main(String[] args) {

       // int[] nums= {4,2,4,0,0,3,0,5,1,0};
        int[] nums= {0};
        moveZeroes(nums);

        for (int i=0; i<nums.length; i++)
            System.out.println(nums + ", ");
    }
}
