import java.util.Arrays;

/**
 * Created by WangJQ on 2015/7/14.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;

        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val)
                nums[result++] = nums[i];
        }

        return result;
    }
}
