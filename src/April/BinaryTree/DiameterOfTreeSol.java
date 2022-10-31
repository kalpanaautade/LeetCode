package April.BinaryTree;

public class DiameterOfTreeSol {
    public static void main(String[] args) {

        TreeNode TL1 = new TreeNode(1);
        TreeNode TR1 = new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1, TR1);
        TreeNode TR2 = new TreeNode(8);
        TreeNode T2 = new TreeNode(6, null, TR2);
        TreeNode T3 = new TreeNode(4, T1, T2);

      int Result=  diameterOfBinaryTree(T3);

      System.out.println("Result:"+Result);

    }


        private static int diameter;
        public static int diameterOfBinaryTree(TreeNode root) {
            diameter = 0;
            longestPath(root);
            return diameter;
        }
        private static int longestPath(TreeNode node){
            if(node == null) return 0;
            // recursively find the longest path in
            // both left child and right child
            int leftPath = longestPath(node.left);
            int rightPath = longestPath(node.right);

            // update the diameter if left_path plus right_path is larger
            diameter = Math.max(diameter, leftPath + rightPath);

            // return the longest one between left_path and right_path;
            // remember to add 1 for the path connecting the node and its parent
            return Math.max(leftPath, rightPath) + 1;
        }

}
