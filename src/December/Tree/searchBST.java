package December.Tree;

public class searchBST {

    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(4);
        TreeNode T1 = new TreeNode(3, TL1,TR1);
        TreeNode TL2= new TreeNode(7);
        TreeNode TR2= new TreeNode(9);
        TreeNode T2= new TreeNode(8, TL2, TR2);
        TreeNode T3= new TreeNode(5, T1, T2);

        TreeNode r =searchBST( T3,  4);

        if (r!=null)
        System.out.println(" Root Found :"+ r.val);

    }
    public static TreeNode searchBST(TreeNode root, int value) {

        if(root.val==value || root==null)
                return  root;

        int Curr =  root.val;
        if(Curr > value)
          return searchBST(root.left, value);
        else
          return searchBST(root.right, value);

    }
}
