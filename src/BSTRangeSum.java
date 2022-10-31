public class BSTRangeSum {

    static int sum=0;
    public static int rangeSumBST(TreeNode root, int low, int high) {

        if (root.val>=low && root.val<=high)
            sum=sum +root.val;
        if(root.val >low && root.left!=null)
            rangeSumBST(root.left, low, high);
        if(root.val< high &&  root.right!=null)
            rangeSumBST(root.right, low, high);
          return sum;
    }
    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(3);
        TreeNode TR1= new TreeNode(7);
        TreeNode T1 = new TreeNode(5, TL1,TR1);
        TreeNode TR2= new TreeNode(15);
        TreeNode T2= new TreeNode(10, T1, TR2);

        int sumR= rangeSumBST( T2,  7, 15);
        System.out.println(sumR);
    }
}
