package July.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TargetSumSubset {
    static List<List<Integer>> ans= new ArrayList<>();

    public static void findSubSet(int[] arr, int target, int idx, LinkedList<Integer> lst)
    {
        if (idx >= arr.length )
            return;

        if (target>0) {
            target-=arr[idx];
            lst.add(arr[idx]);
        }
        else if ( target<0)
        {
            int num = lst.removeLast();
            target+=num;
            return;
        }
        else if (target==0) {
            ans.add(new ArrayList<>(lst) );
            lst.removeLast();

        }

        for(int i=idx; i< arr.length; i++)
        {
            findSubSet(arr, target, idx+1,lst  );
           // lst.removeLast();
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        findSubSet(arr,60, 0, new LinkedList<Integer>());

        System.out.println(ans);
    }
}
