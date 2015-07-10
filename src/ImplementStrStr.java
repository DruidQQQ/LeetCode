/**
 * Created by WangJQ on 2015/7/10.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null)
            return -1;
        if(needle.length() > haystack.length())
            return needle.length() == 0 ? 0 : -1;
        if(needle.length() == 0)
            return 0;

        int index = -1, j;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                index = i;
                for(j = 0; j < needle.length(); j++) {
                    if((i + j) < haystack.length()) {
                        if (haystack.charAt(i + j) != needle.charAt(j))
                            break;
                    }
                }
                if(index > 0 && j == (needle.length() - 1))
                    return index;
                else
                    index = -1;
            }
        }

        return index;
    }
}
