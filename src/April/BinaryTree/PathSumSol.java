package April.BinaryTree;

public class PathSumSol {

       static int max_sum=Integer.MIN_VALUE;
        public static int maxPathSum(TreeNode node) {
            maxgain(node);
            return max_sum;
        }

        public static int maxgain(TreeNode node) {
            if (node == null) return 0;

            // max sum on the left and right sub-trees of node
            int left_gain= maxgain(node.left);
            left_gain = Math.max(left_gain, 0);

            int right_gain = maxgain(node.right);
            right_gain = Math.max(right_gain, 0);

            // the price to start a new path where `node` is a highest node
            int price_newpath = node.val + left_gain + right_gain;

            // update max_sum if it's better to start a new path
            max_sum = Math.max(max_sum, price_newpath);

            // for recursion :
            // return the max gain if continue the same path
            return node.val + Math.max(left_gain, right_gain);
        }

    public static void main(String[] args) {

        TreeNode TL1 = new TreeNode(1);
        TreeNode TR1 = new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1, TR1);
        TreeNode TL2 = new TreeNode(4);
        TreeNode TR2 = new TreeNode(8);
        TreeNode T2 = new TreeNode(6, TL2, TR2);
        TreeNode T3 = new TreeNode(4, T1, T2);

        int result = maxPathSum(T3);

        System.out.println("Result:"+result);
    }
}