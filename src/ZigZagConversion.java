/**
 * Created by WangJQ on 2015/7/14.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0)
            return "";
        if(numRows == 1)
            return s;

        String ret = "";
        int len = s.length();
        for(int i = 0; i < len && i < numRows; i++) {
            int index = i;
            ret += s.charAt(index);
            for(int j = 1; index < len; ++j) {
                if(i == 0 || i == numRows - 1) {
                    index += 2 * numRows - 2;
                }
                else {
                    if((j & 0x1) == 1)
                        index += 2 * (numRows - 1 - i);
                    else
                        index += 2 * i;
                }
                if(index < len)
                    ret += s.charAt(index);
            }
        }

        return ret;
    }
}
