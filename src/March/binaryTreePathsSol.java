package March;
import java.util.ArrayList;
import java.util.List;

public class binaryTreePathsSol {

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> lst = new ArrayList<>();
        Travel(root, lst, "");
        return lst;

    }

    public static void Travel(TreeNode root, List<String> lst, String Path) {
        if (root == null)
            return;
        if (!Path.isEmpty())
          Path = Path +  "->"+ root.val ;
        else
            Path = ""+ root.val ;

        if (root.left == null && root.right == null) {
            lst.add(Path);
            Path = "";

        }

        Travel(root.left, lst, Path);
        Travel(root.right, lst, Path);
    }

    public static void main(String[] args) {
        TreeNode TL1 = new TreeNode(1);
        TreeNode TR1 = new TreeNode(5);
        TreeNode T1 = new TreeNode(2, TL1, TR1);
        TreeNode TL2 = new TreeNode(4);
        TreeNode TR2 = new TreeNode(8);
        TreeNode T2 = new TreeNode(6, TL2, TR2);
        TreeNode T3 = new TreeNode(4, T1, T2);

        List<String> lst = binaryTreePaths(T3);

        for (int i = 0; i < lst.size(); i++)
            System.out.print(lst.get(i) + ",");
    }
}