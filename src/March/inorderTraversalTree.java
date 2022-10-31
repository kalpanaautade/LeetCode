package March;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversalTree {


    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1,TR1);
        TreeNode TL2= new TreeNode(4);
        TreeNode TR2= new TreeNode(8);
        TreeNode T2= new TreeNode(6, TL2, TR2);
        TreeNode T3= new TreeNode(4, T1, T2);

        List<Integer> lst= inorderTraversal(T3);

        for (int i=0; i<lst.size(); i++)
            System.out.print(lst.get(i) + ",");

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> lst= new ArrayList<Integer>();
        traversal(root,lst);
        return  lst;
    }

    static  void traversal(TreeNode root, List<Integer> lst) {
        if (root != null) {
            traversal(root.left,lst);
            lst.add(root.val);
           traversal(root.right,lst);
        }
    }
}
