/**
 * Created by WangJQ on 2015/7/27.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if(s == null)
            return 0;

        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'A' + 1;
            result = result * 26 + cur;
        }

        return result;
    }
}
