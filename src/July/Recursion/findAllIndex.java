package July.Recursion;

public class findAllIndex {

    public static int[] findAllXIndex(int[] arr, int x, int idx, int f_idx)
    {
        if (idx==arr.length)
        {
            return  new int[f_idx];
        }

        if(arr[idx]==x)
        {
            int[] res= findAllXIndex(arr, x, idx+1, f_idx+1);
            res[f_idx] = idx;
            return res;
        }
        else
        {
            int[] res= findAllXIndex(arr, x, idx+1, f_idx);
            return res;
        }

    }
    public static void main(String[] args) {

        int[] arr={2,3,6,9,3,4,6,2,3,10};
        int x=3;

        int[] ans = findAllXIndex(arr,  x,0,0);

        for (int i=0; i<ans.length; i++)
            System.out.println(ans[i]);

    }
}
