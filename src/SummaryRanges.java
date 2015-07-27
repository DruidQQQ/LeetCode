import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangJQ on 2015/7/14.
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0)
            return new ArrayList<String>();

        List<String> result = new ArrayList<String>();
        if(nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        int start = 0;
        int pre = 0;
        String tmp;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[pre] + 1) {
                if(start == pre)
                    tmp = String.valueOf(nums[pre]);
                else
                    tmp = nums[start] + "->" + nums[pre];
                result.add(tmp);
                start = i;
            }
            ++pre;
        }

        if(start == pre)
            result.add(String.valueOf(nums[start]));
        else {
            tmp = nums[start] + "->" + nums[pre];
            result.add(tmp);
        }

        return result;
    }

    public static void main(String args[]) {
        int[] a = {0, 1};
        summaryRanges(a);
    }
}
