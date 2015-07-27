import java.util.*;

/**
 * Created by WangJQ on 2015/7/26.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        return dfs(root, 0, res);
    }

    public List<List<Integer>> dfs(TreeNode root, int level, List<List<Integer>> list) {
        if(root == null)
            return list;

        if(list.size() == level)
            list.add(new ArrayList<Integer>());

        list.get(level).add(root.val);
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);

        return list;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
