/**
 * Created by WangJQ on 2015/7/14.
 */
public class CountAndSay {
    public String  countAndSay(int n) {
        String result = "1";
        int i = 1;
        while (i < n) {
            result = generateNext(result);
            ++i;
        }

        return result;
    }

    public String generateNext(String s) {
        StringBuffer ret = new StringBuffer();

        char tmp = s.charAt(0);
        int count = 0;
        for(int j = 0; j < s.length(); j++) {
            if(tmp == s.charAt(j))
                ++count;
            else {
                ret.append(count);
                ret.append(tmp);
                count = 1;
                tmp = s.charAt(j);
            }
        }
        ret.append(count);
        ret.append(tmp);

        return ret.toString();
    }
}
