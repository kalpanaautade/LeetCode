package December.Tree;

public class sumRootToLeaf {

    static int rootTotal=0;
    public static void PreOrder(TreeNode root, int currentval) {

        if (root!=null) {
            currentval = currentval << 1 | root.val;

            if ( root.left==null && root.right==null)
            {
                rootTotal= rootTotal+ currentval;
            }
            PreOrder(root.left,currentval);
            PreOrder(root.right,currentval);
        }



    }
    public static int sumOfRootToLeafNode(TreeNode root) {
        PreOrder( root ,0);
        return rootTotal;
    }

    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(0);
        TreeNode TR1= new TreeNode(1);
        TreeNode T1 = new TreeNode(0, TL1,TR1);
        TreeNode TL2= new TreeNode(0);
        TreeNode TR2= new TreeNode(1);
        TreeNode T2= new TreeNode(1, TL2, TR2);
        TreeNode T3= new TreeNode(1, T1, T2);


        int r= sumOfRootToLeafNode( T3);
        System.out.println(" Tree Sum= " + r);
    }
}
