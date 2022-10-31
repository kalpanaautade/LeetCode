package April.Array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m,nums2, n );

        for(int i=0; i<m; i++)
        {
            System.out.println(nums1[i] + ", ");
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        while(i<m)
        {
            if(nums1[i]<=nums2[j])
            {
                i++;
                j=0;
            }
            else if (nums1[i]>nums2[j])
            {
                int tmp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=tmp;
                i++;
                j++;
            }

        }
        i=0;
        for (int k=m; k<m+n ; k++)
        {
            if(nums2[i]!=0)
                nums1[k]=nums2[i];
            i++;
        }

    }

}
