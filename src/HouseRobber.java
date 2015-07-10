/**
 * Created by WangJQ on 2015/7/10.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int preRob = 0, preNotRob = 0;
        int temp = 0;

        for(int i = 0; i < nums.length; i++) {
            temp = preNotRob;
            preNotRob = Math.max(preRob, preNotRob);
            preRob = temp + nums[i];
        }

        return Math.max(preRob, preNotRob);
    }
}
