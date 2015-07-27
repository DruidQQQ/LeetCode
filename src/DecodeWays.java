/**
 * Created by WangJQ on 2015/7/14.
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0)
            return 0;
        if(s.charAt(0) == '0')
            return 0;
        if(s.length() == 1)
            return 1;

        int[] nums = new int[s.length() + 1];
        nums[0] = 1;
        nums[1] = 1;

        int tmp;
        for(int i = 2; i <= s.length(); i++) {
            tmp = Integer.parseInt(s.substring(i - 1, i));
            if(tmp != 0)
                nums[i] = nums[i - 1];
            if(s.charAt(i - 2) != '0') {
                tmp = Integer.parseInt(s.substring(i - 2, i));
                if(tmp >= 10 && tmp <= 26)
                    nums[i] += nums[i - 2];
            }
        }

        return nums[s.length()];
    }
}
