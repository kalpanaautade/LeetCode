package April.BinaryTree;

public class LowestCommonAncestor {

        private static TreeNode ans;

        public LowestCommonAncestor() {
            // Variable to store LCA node.
            this.ans = null;

        }

        private static boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

            // If reached the end of a branch, return false.
            if (currentNode == null) {
                return false;
            }

            // Left Recursion. If left recursion returns true, set left = 1 else 0
            int left = recurseTree(currentNode.left, p, q) ? 1 : 0;

            // Right Recursion
            int right = recurseTree(currentNode.right, p, q) ? 1 : 0;

            // If the current node is one of p or q
            int mid = (currentNode == p || currentNode == q) ? 1 : 0;


            // If any two of the flags left, right or mid become True
            if (mid + left + right >= 2) {
                ans = currentNode;
            }

            // Return true if any one of the three bool values is True.
            return (mid + left + right > 0);
        }

        public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // Traverse the tree
            recurseTree(root, p, q);
            return ans;
        }


    public static void main(String[] args) {
        TreeNode TL1= new TreeNode(1);
        TreeNode TR1= new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1,TR1);
        TreeNode TL2= new TreeNode(4);
        TreeNode TR2= new TreeNode(8);
        TreeNode T2= new TreeNode(6, TL2, TR2);
        TreeNode T3= new TreeNode(4, T1, T2);

        TreeNode result=  lowestCommonAncestor(T3,TL1, T2);

        System.out.println("Result:"+ result.val);

    }
}
