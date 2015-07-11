/**
 * Created by WangJQ on 2015/7/11.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
            return true;

        int start = 0;
        int end = s.length() - 1;

        while(true) {
            while(!isAlphanumeric(s.charAt(start))) {
                ++start;
                if(start == end || start == (end - 1))
                    return true;
                else if(start == s.length())
                    return false;
            }
            while(!isAlphanumeric(s.charAt(end)))
                --end;
            if(s.charAt(start) == s.charAt(end) || Math.abs(s.charAt(start) - s.charAt(end)) == 32) {
                if(start == end || start == (end - 1))
                    return true;
                ++start;
                --end;
            }
            else
                return false;
        }
    }

    public boolean isPalindrome2(String s) {
        if(s == null || s.length() == 0)
            return true;

        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();

        while(start < end) {
            while(start < end && !isAlphanumeric(s.charAt(start)))
                ++start;
            while(start < end && !isAlphanumeric(s.charAt(end)))
                --end;
            if(s.charAt(start--) != s.charAt(end--))
                return false;
        }

        return true;
    }

    public boolean isAlphanumeric(char c) {
        if(c >= '0' && c <= '9')
            return true;
        if(c >= 'a' && c <= 'z')
            return true;
        if(c >= 'A' && c <= 'Z')
            return true;
        return false;
    }
}
