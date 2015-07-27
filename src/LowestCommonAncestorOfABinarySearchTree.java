/**
 * Created by WangJQ on 2015/7/17.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null)
            return null;

        if(Math.max(p.val, q.val) < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if(Math.min(p.val, q.val) > root.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
