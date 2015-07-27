import java.util.HashMap;

/**
 * Created by WangJQ on 2015/7/14.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i], 1);
        }

        return false;
    }
}
