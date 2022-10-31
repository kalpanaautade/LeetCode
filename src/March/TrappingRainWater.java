package March;

public class TrappingRainWater {


    public static int trap2(int[] height)
    {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if(height[left] >= left_max )
                    left_max = height[left] ;
                else
                    ans += (left_max - height[left]);
                ++left;
            }
            else {
                if( height[right] >= right_max )
                    right_max = height[right];
                else
                    ans += (right_max - height[right]);
                --right;
            }
        }
        return ans;
    }

    public static int trap(int[] height) {
        int sum=0;
        for(int i=0; i<height.length; i++)
        {
            int tmpsum=0;
            int j=0;
            for( j=i+1; j<height.length; j++) {
                if (height[i] > 0 && height[i] > height[j]) {
                    tmpsum = tmpsum + (height[i] - height[j]);
                }
                else
                    break;
            }
            if ( height[i]>0 && j < height.length)
            {
                sum=sum+tmpsum;
                i=j-1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       // int[] hights= {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] hights= {4,2,0,3,2,5};
        int result= trap2(hights);
        System.out.println("Result:"+result);
    }
}
