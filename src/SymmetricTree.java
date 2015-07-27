/**
 * Created by WangJQ on 2015/7/26.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return decursiveSymmetric(root.left, root.right);
    }

    public boolean decursiveSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;

        return left.val == right.val && decursiveSymmetric(left.left, right.right) &&
                decursiveSymmetric(left.right, right.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
