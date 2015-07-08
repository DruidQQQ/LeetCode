import java.util.HashMap;

/**
 * Created by WangJQ on 2015/7/8.
 */
public class FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator == 0)
            return "";
        if(numerator == 0)
            return "0";

        String result = "";

        if((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0))
            result = "-";

        long num = numerator, den = denominator;
        num = Math.abs(num);
        den = Math.abs(den);

        long quotient = num / den;
        result += String.valueOf(quotient);

        long reminder = (num % den) * 10;
        if(reminder == 0)
            return result;

        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        result += ".";
        while(reminder != 0) {
            if(map.containsKey(reminder)) {
                int start = map.get(reminder);
                String part1 = result.substring(0, start);
                String part2 = result.substring(start, result.length());
                result = part1 + "(" + part2 + ")";
                return result;
            }

            map.put(reminder, result.length());
            quotient = reminder / den;
            result += String.valueOf(quotient);
            reminder = (reminder % den) * 10;
        }

        return result;
    }
}
