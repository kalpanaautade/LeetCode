package December.Tree;

public class CousinsLeaf {

    static boolean isCousine=false;
    static int recordFirstdepth =-1;

    boolean left=false;
    boolean right=false;
    public static boolean checkDepth(TreeNode root, int x, int y, int depth) {

        if( root==null)
            return false;

            if (root.val == x || root.val == y) {
                if (recordFirstdepth == -1)
                    recordFirstdepth = depth;

                return recordFirstdepth == depth;
            }
            if (recordFirstdepth != -1 && depth > recordFirstdepth)
                return false;

        boolean left= checkDepth(root.left, x, y, depth + 1);
        boolean right= checkDepth(root.right, x, y, depth + 1);

        // this.recordedDepth != depth + 1 would ensure node x and y are not
        // immediate child nodes, otherwise they would become siblings.
        if (left && right && recordFirstdepth != depth + 1) {
            isCousine = true;
        }
           return left||right;

    }


    public static boolean isCousins(TreeNode root, int x, int y) {
        boolean result= checkDepth(root, x, y, 0);
       return  isCousine;
    }

    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(-3);
        TreeNode TR1= new TreeNode(3);
        TreeNode T1 = new TreeNode(2, TL1,TR1);
        TreeNode TL2= new TreeNode(-4);
        TreeNode TR2= new TreeNode(4);
        TreeNode T2= new TreeNode(-2, TL2, TR2);
        TreeNode T3= new TreeNode(1, T1, T2);

        boolean result= isCousins(T3, 3, 4);
        System.out.println(" Result : " +  result);
    }
}
