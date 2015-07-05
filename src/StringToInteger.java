/**
 * Created by WangJQ on 2015/7/5.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        long result = 0L;
        boolean negative = false;
        boolean flag = true;
        int digit, blankNums = 0;

        if(str == "")
            return 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && flag == true) {
                ++blankNums;
                continue;
            }
            if((str.charAt(i) == '-' || str.charAt(i) == '+') && flag == true) {
                if(str.charAt(i) == '-')
                    negative = true;
                flag = false;
            }
            else {
                flag = false;
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    digit = str.charAt(i) - '0';
                    result = result * 10 + digit;
                    if(result > Integer.MAX_VALUE)
                        return negative == true ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                else if(str.charAt(i) == ' ')
                    return negative == true ? (int)-result : (int)result;
                else
                    return 0;
            }
        }
        return negative == true ? (int)-result : (int)result;
    }
}
