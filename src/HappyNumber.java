import java.util.HashSet;

/**
 * Created by WangJQ on 2015/7/27.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();

        while(true) {
            n = computeSquare(n);
            if(n == 1)
                return true;
            else {
                if(set.contains(n))
                    return false;
                else
                    set.add(n);
            }
        }
    }

    public int computeSquare(int x) {
        int res = 0;

        while(x != 0) {
            res += (x % 10) * (x % 10);
            x /= 10;
        }

        return res;
    }

    public static void main(String args[]) {
        HappyNumber a = new HappyNumber();
        a.isHappy(3);
    }
}
