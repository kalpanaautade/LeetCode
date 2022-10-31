import java.time.Clock;

public class maximumDepthTree {

    public static void main(String[] args) {

        TreeNode TL1= new TreeNode(6);
        TreeNode TR1= new TreeNode(7);
        TreeNode TR2 = new TreeNode(5);
        TreeNode TL2= new TreeNode(4);
        TreeNode T1 = new TreeNode(2, TL2,TR2);
        TreeNode T2= new TreeNode(3, TL1,TR1);
        TreeNode T3 = new TreeNode(1, T1,T2);

        //int res=maxDepth(T3);

        maximum_depth(T3,0);

        System.out.println("Result:-"+ answer);
    }

        public static int maxDepth(TreeNode root) {


            if (root == null) {
                return 0;
            } else {
                System.out.println("Root:-" + root.val);
                int left_height = maxDepth(root.left);
                int right_height = maxDepth(root.right);
                System.out.println("------------------");
                System.out.println("left_height:-" + left_height);
                System.out.println("right_height:-" + right_height);
                int max_root=java.lang.Math.max(left_height, right_height) + 1;
                return max_root;
            }
        }

    private static int answer; // don't forget to initialize answer before call maximum_depth
    private static void maximum_depth(TreeNode root, int depth) {

        System.out.print(" --- Depth: "+depth );
        if (root == null) {
            return;
        }
        System.out.print(" Node: "+root.val +" -> ");
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        System.out.println(" --- stack value for Depth: "+depth );
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }

}
