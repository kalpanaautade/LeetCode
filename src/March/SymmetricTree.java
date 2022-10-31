package March;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {

        boolean result= isMirror(root, root);

        System.out.println("Is Symmetric :" + result);

        return result;
    }

    private static boolean isMirror(TreeNode t1, TreeNode t2)
    {
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;

        return t1.val==t2.val &&
        isMirror(t1.left, t2.right) &&
                isMirror(t1.right, t2.left);

    }
    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1,TR1);
        TreeNode TL2= new TreeNode(5);
        TreeNode TR2= new TreeNode(1);
        TreeNode T2= new TreeNode(2, TL2, TR2);
        TreeNode T3= new TreeNode(4, T1, T2);

        isSymmetric(T3);
    }
}
