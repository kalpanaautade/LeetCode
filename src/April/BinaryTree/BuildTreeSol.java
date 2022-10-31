package April.BinaryTree;

public class BuildTreeSol {

    public static void Travelsal(int[] preorder, int[] inorder, int start, int end, TreeNode root, boolean left)
    {
        TreeNode node=null;
        int rootval=preorder[start];

        int Index=findIndexInOrder(rootval, inorder,start, end);

        if (root.val==-1)
        {
            root.val=rootval;
            node=root;
        }
        else
        {
             node= new TreeNode(rootval);

        }
        Travelsal(preorder, inorder , start+1, Index, node ,true );
        Travelsal(preorder, inorder , Index+1, end, node ,false );

    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode tree= new TreeNode(-1);
        Travelsal(preorder, inorder , 0, preorder.length-1, tree ,true );
        return  tree;
    }

    public static int findIndexInOrder(int val, int[] inorder,int start, int end)
    {
        for (int k=start; k<=end; k++)
            if (inorder[k]== val)
                return k;

            return -1;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode node= buildTree(preorder, inorder);
    }
}
