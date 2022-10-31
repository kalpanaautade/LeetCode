package April.Array;

public class MaxContainerSol {

    public static int maxArea(int[] height) {

        int maxheight=0;
        for (int left =0; left< height.length-1; left++)
            for(int right = height.length-1; right >left ;  right--) {
                int sum=height[left];
                for (int k = left + 1; k <= right; k++) {
                    if (height[left] < height[k])
                        sum += height[left];
                    else
                        sum += height[k];
                    maxheight=Math.max(maxheight, sum);
                }
            }
      return maxheight;

    }
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
        int result= maxArea( height);
        System.out.println("Result:" + result);
    }
}
