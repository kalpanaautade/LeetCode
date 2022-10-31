package December.Tree;

import java.util.ArrayList;
import java.util.List;

public class SimilarLeafNode {


    public static void dfs(TreeNode root, List<Integer> leaflst )
    {
        if(root ==null)
            return;
        if(root.left ==null &&  root.right ==null)
            leaflst.add(root.val);

        dfs(root.left,leaflst);
        dfs(root.right, leaflst);
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

         List<Integer> leaflst1 = new ArrayList<Integer>();
         List<Integer> leaflst2 = new ArrayList<Integer>();
        dfs(root1,  leaflst1 );
        dfs(root2,  leaflst2 );

        return leaflst1.equals(leaflst2);

    }
    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(7);
        TreeNode T1 = new TreeNode(3, TL1,TR1);
        TreeNode TL2= new TreeNode(7);
        TreeNode TR2= new TreeNode(19);
        TreeNode T2= new TreeNode(8, TL2, TR2);
        TreeNode root1= new TreeNode(5, T1, T2);

        TreeNode RTL1= new TreeNode(1);
        TreeNode RTR1= new TreeNode(4);
        TreeNode RT1 = new TreeNode(3, RTL1,RTR1);
        TreeNode RTL2= new TreeNode(7);
        TreeNode RTR2= new TreeNode(9);
        TreeNode RT2= new TreeNode(8, RTL2, RTR2);
        TreeNode root2= new TreeNode(5, RT1, RT2);

        boolean result= leafSimilar( root1, root2);

        System.out.println(" leafSimilar:   " +result );
    }
}
