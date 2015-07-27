import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangJQ on 2015/7/26.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        dfs(root, 0, list);
        reverseList(list);

        return list;
    }

    public void dfs(TreeNode root, int level, List<List<Integer>> list) {
        if(root == null)
            return;

        if(list.size() == level)
            list.add(new ArrayList<Integer>());

        list.get(level).add(root.val);
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }

    public void reverseList(List<List<Integer>> list) {
        int i = 0, j = list.size() - 1;

        while(i < j) {
            List<Integer> cur = list.get(i);
            list.set(i, list.get(j));
            list.set(j, cur);
            ++i;
            --j;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
