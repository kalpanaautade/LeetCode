package March;

public class MedianOfSortedArray {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        double result= findMedianSortedArrays(nums1, nums2);

        System.out.println("Result :"+ result);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i=0, j=0, k=0;
        int m=nums1.length;
        int n= nums2.length;
        int[] res=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i] < nums2[j])
            {
                res[k]=nums1[i];
                i++;

            }
            else
            {
                res[k]=nums2[j];
                j++;
            }
             k++;
        }
        if(i>=m && j<n)
        {
            while(j<n)
            {
                res[k]=nums2[j];
                j++;
                k++;
            }
        }
        else if (j>=n && i<m)
        {
            while(i<m) {
                res[k] = nums1[i];
                i++;
                k++;
            }
        }


        double median=0;
        if ( (m+n )% 2==0)
        {
            int i1=(m+n)/2;
            int i2=i1;
            median=( res[i1-1] + res[i2])/2.0;

        }
        else
        {
            int i1=(m+n)/2;
            median= res[i1];
        }

        return median;

    }

}
