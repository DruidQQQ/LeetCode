import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangJQ on 2015/7/11.
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> leeterCombinations(String digits) {
        if(digits == null || digits.length() == 0)
            return new ArrayList<String>();

        List<String> result = new ArrayList<String>();
        String[] map = new String[10];
        map[0] = "";
        map[1] = "";
        map[2] = "abc";
        map[3] = "def";
        map[4] = "ghi";
        map[5] = "jkl";
        map[6] = "mno";
        map[7] = "pqrs";
        map[8] = "tuv";
        map[9] = "wxyz";

        char[] temp = new char[digits.length()];
        dfs(0, temp, digits, map, result);

        return result;
    }

    public void dfs(int depth, char[] current, String digits, String[] map, List<String> ret) {
        if(depth == digits.length()) {
            ret.add(new String(current));
            return;
        }

        for(int i = 0; i < map[digits.charAt(depth) - '0'].length(); i++) {
            current[depth] = map[digits.charAt(depth) - '0'].charAt(i);
            dfs(depth + 1, current, digits, map, ret);
        }
    }
}
