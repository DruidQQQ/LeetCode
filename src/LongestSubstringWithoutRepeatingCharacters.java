import java.util.HashSet;

/**
 * Created by WangJQ on 2015/7/9.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;

        int max = 0;
        int start = 0, end = 0;
        HashSet<Character> substring = new HashSet<Character>();
        while(end < s.length()) {
            if(!substring.contains(s.charAt(end))) {
                substring.add(s.charAt(end));
                ++end;
            }
            else {
                max = Math.max(max, end - start);
                substring.remove(s.charAt(start));
                ++start;
            }
        }
        max = Math.max(max, end - start);

        return max;
    }
}
