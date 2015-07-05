/**
 * Created by WangJQ on 2015/7/5.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long result = 0L;
        int reminder;

        while(x != 0) {
            reminder = x % 10;
            result = result * 10 + reminder;
            x /= 10;
        }

        if (result >= 0)
            return result > Integer.MAX_VALUE ? 0 : (int)result;
        else
            return result < Integer.MIN_VALUE ? 0 : (int) result;
    }
}
