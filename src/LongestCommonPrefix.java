import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by WangJQ on 2015/7/9.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return null;
        if(strs.length == 1)
            return strs[0];

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) { return a.length() - b.length();}
        });

        int mark = 0;
        int length = 0;

        while(mark < strs.length) {
            if(strs[mark] == "")
                ++mark;
            else
                break;
        }
        if(mark == (strs.length - 1))
            return strs[mark];
        for(int j = 0; j < strs[mark].length(); j++) {
            if(strs[mark].charAt(j) == strs[mark+1].charAt(j))
                ++length;
            else
                break;
        }
        for(int i = mark + 2; i < strs.length; i++) {
            while(!strs[i].substring(0, length).equals(strs[mark].substring(0, length))) {
                if(length == 0)
                    return "";
                --length;
            }
        }

        return strs[mark].substring(0, length);
    }

    public static String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0 || strs == null)
            return "";

        for(int i = 0; i < strs[0].length(); ++i) {
            for(String s : strs) {
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, i);
            }
        }

        return strs[0];
    }

    public static String longestCommonPrefix3(String[] strs) {
        if(strs == null) return null;
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String first = strs[0];
        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i <= first.length(); i++) {
            set.add(first.substring(0,i));
        }

        int end = strs[1].length();

        for(int i = 1; i < strs.length; i++) {
            String str = strs[i];

            if(end > str.length()) end = str.length();

            while(end >= 0 && !set.contains(str.substring(0, end))) {
                end--;
            }
        }

        return strs[0].substring(0, end);
    }

    public static void main(String args[]) {
        String[] strs = {"aa","aa"};
        System.out.println(longestCommonPrefix2(strs));
    }
}
