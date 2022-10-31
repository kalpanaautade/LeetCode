package December.Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class minDiffInBST {

    static List<Integer> minval = new ArrayList<Integer>();
    public static void dfs(TreeNode root)
    {
        if(root ==null)
            return;
         minval.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public static int minDiffInTree(TreeNode root) {

        dfs(root);
        Collections.sort(minval);

        Integer ans = Integer.MAX_VALUE;

        for (int i=0; i< minval.size()-1 ; i++ )
         ans = Math.min(ans, minval.get(i+1) - minval.get(i) );
        return  ans;
    }
    public static void main(String[] args) {
        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(4);
        TreeNode T1 = new TreeNode(3, TL1,TR1);
        TreeNode TL2= new TreeNode(7);
        TreeNode TR2= new TreeNode(9);
        TreeNode T2= new TreeNode(8, TL2, TR2);
        TreeNode T3= new TreeNode(5, T1, T2);

        int result= minDiffInTree(T3);

        System.out.println(" Result: " + result);
    }
}
