import java.util.*;

/**
 * Created by WangJQ on 2015/7/13.
 */
public class Anagrams {
    public static List<String> anagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return null;

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> result = new ArrayList<String>();
        String s = "";

        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() != 0) {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                s = String.valueOf(chars);
            }
            else
                s = "";
            if(map.get(s) == null)
                map.put(s, i);
            else {
                if(!result.contains(strs[map.get(s)]))
                    result.add(strs[map.get(s)]);
                result.add(strs[i]);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        String[] aa = {"eta", "ate", "tea"};
        anagrams(aa);
    }
}
