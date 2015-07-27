import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by WangJQ on 2015/7/15.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        int index= 0;
        int tmp;

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else {
                tmp = map.get(nums[i]);
                map.put(nums[i], ++tmp);
                if(max < tmp) {
                    max = tmp;
                    index = i;
                }
            }
        }

        return nums[index];
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        int mark = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                mark = nums[i];
                ++count;
            }
            else {
                if(mark == nums[i])
                    ++count;
                else
                    --count;
            }
        }

        return mark;
    }
}
