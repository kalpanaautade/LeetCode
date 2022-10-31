package December.Tree;


import java.util.*;

public class TreeLonelyNodes {

    static List<Integer> lst= new ArrayList<Integer>();

    public static List<Integer> getLonelyNodes(TreeNode root) {
       Travel(root);
        return lst;
    }

    public static void Travel(TreeNode root)
    {
        if (root==null)
            return;
        if(root.left!=null && root.right!=null) {
            Travel(root.left);
            Travel(root.right);
        }
        if(root.left!=null && root.right==null) {
            lst.add(root.left.val);
            Travel(root.left);
        }
        if(root.right!=null && root.left==null)
        {
            lst.add(root.right.val);
            Travel(root.right);
        }


    }


    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(3);
        TreeNode TR1= new TreeNode(7);
        TreeNode T1 = new TreeNode(5, TL1,null);
        TreeNode TR2= new TreeNode(15);
        TreeNode T2= new TreeNode(10, T1, TR2);

        List<Integer> lst =getLonelyNodes(T2);

        for (int i=0; i<lst.size(); i++)
            System.out.print(lst.get(i) + ",");


    }
}
