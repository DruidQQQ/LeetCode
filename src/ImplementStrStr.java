/**
 * Created by WangJQ on 2015/7/10.
 */
public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int i = 0, j = 0, n = haystack.length(), m = needle.length();

        if (m == 0)
            return 0;

        int[] lps = getLPS(needle, m);

        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
                // found the needle in haystack!
                if (j == m)
                    return i - m;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        return -1;
    }

    // KMP get the longest prefix and suffix
    static int[] getLPS(String s, int n) {
        int i = 1, len = 0;
        int[] lps = new int[n];

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len == 0) {
                lps[i++] = 0;
            } else {
                len = lps[len - 1];
            }
        }

        return lps;
    }

    public static void main(String args[]) {
        System.out.println(strStr("mississippi", "issip"));
    }
}
