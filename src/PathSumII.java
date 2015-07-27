import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangJQ on 2015/7/27.
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        findPath(root, sum, res, new ArrayList<Integer>());

        return res;
    }

    public void findPath(TreeNode root, int sum, List<List<Integer>> res, List<Integer> curList) {
        if(root == null)
            return;

        curList.add(root.val);
        if(root.left == null && root.right == null && root.val == sum) {
            List<Integer> copy = new ArrayList<Integer>(curList);
            res.add(copy);
        }
        findPath(root.left, sum - root.val, res, curList);
        curList.remove(curList.size() - 1);
        findPath(root.right, sum  - root.val, res, curList);
        curList.remove(curList.size() - 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
