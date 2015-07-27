/**
 * Created by WangJQ on 2015/7/26.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;

        if(p.val == q.val) {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }

        return false;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
