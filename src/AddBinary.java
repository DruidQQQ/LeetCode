/**
 * Created by WangJQ on 2015/7/9.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0)
            return b;
        if(b == null || b.length() == 0)
            return a;

        String result = "";
        int carry = 0, sum;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 && j >= 0) {
            sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            result = sum % 2 + result;
            carry = sum >> 1;
            --i;
            --j;
        }
        while(i >= 0) {
            sum = a.charAt(i) - '0' + carry;
            result = sum % 2 + result;
            carry = sum >> 1;
            --i;
        }

        while(j >= 0) {
            sum = b.charAt(j) - '0' + carry;
            result = sum % 2 + result;
            carry = sum >> 1;
            --j;
        }

        if(carry == 1)
            result = "1" + result;

        return result;
    }
}
