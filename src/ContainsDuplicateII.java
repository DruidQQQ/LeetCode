import java.util.HashSet;
import java.util.Set;

/**
 * Created by WangJQ on 2015/7/15.
 */
public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return false;
        if(k == 0)
            return false;

        Set<Integer> set = new HashSet<Integer>();
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                end++;
            }
            else
                return true;
            if(end -start > k) {
                set.remove(nums[start]);
                ++start;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int[] aa = {0,1,2,3,2,5};
        System.out.println(containsNearbyDuplicate(aa, 3));
    }
}
