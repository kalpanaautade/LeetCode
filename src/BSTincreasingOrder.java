public class BSTincreasingOrder {
    TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        curr=ans;
        inorder(root);
        return ans.right;

    }

    private void inorder(TreeNode node)
    {
        if(node.left!=null)
            inorder(node.left);
        curr.right=node;
        curr.left=null;
        curr=node;
        if(node.right!=null)
            inorder(node.right);


    }
    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(3);
        TreeNode TR1= new TreeNode(7);
        TreeNode T1 = new TreeNode(5, TL1,TR1);
        TreeNode TR2= new TreeNode(15);
        TreeNode T2= new TreeNode(10, T1, TR2);

    }
}
