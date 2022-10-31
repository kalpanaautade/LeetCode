package December.Tree;

import java.util.ArrayList;
import java.util.List;

public class UnivalTree {

    static List<Integer> lst;

    public static  void dfs(TreeNode root)
    {
        if (root!=null) {
            lst.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
    public static  boolean isUnivalTree(TreeNode root) {
        lst = new ArrayList<Integer>();
        dfs(root);
        for (Integer v: lst)
        {
            if (v != lst.get(0))
                return false;
        }
            return true;
        }

    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(1);
        TreeNode T1 = new TreeNode(1, TL1,TR1);
        TreeNode TR2= new TreeNode(1);
        TreeNode T2= new TreeNode(1, T1, TR2);

        boolean res= isUnivalTree(T2);

        System.out.println("isUnivalTree: " +  res);
    }
}
