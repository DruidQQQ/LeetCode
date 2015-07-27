import java.util.Stack;

/**
 * Created by WangJQ on 2015/7/13.
 */
public class BasicCalculatorII {
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;

        int result = 0;
        Stack<Character> symbol = new Stack<Character>();
        Stack<Integer> value = new Stack<Integer>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                value.push(s.charAt(i) - '0');
            else if(s.charAt(i) == ' ')
                ++i;
            else {
                if(symbol.isEmpty())
                    symbol.push(s.charAt(i));
                else {
                    if(s.charAt(i) == '*' || s.charAt(i) == '/') {
                        if(symbol.peek() == '+' || symbol.peek() == '-')
                            symbol.push(s.charAt(i));
                    }
                }
            }
        }

        return result;
    }

    public String getCastExpression(String s) {
        Stack<Character> symbol = new Stack<Character>();
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                result += s.charAt(i);
            else {
                if(symbol.isEmpty())
                    symbol.push(s.charAt(i));
                else {
                    if(s.charAt(i) == '*' || s.charAt(i) == '/') {
                        if(symbol.peek() == '+' || symbol.peek() == '-')
                            symbol.push(s.charAt(i));
                    }
                }
            }
        }

        return result;
    }
}
