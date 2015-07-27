import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangJQ on 2015/7/14.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList<List<Integer>>();

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(1);
        result.add(tmp);
        if(numRows == 1)
            return result;

        for(int i = 1; i < numRows; i++) {
            List<Integer> pre = result.get(i - 1);
            tmp = new ArrayList<Integer>();
            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i)
                    tmp.add(1);
                else {
                    int sum = pre.get(j) + pre.get(j - 1);
                    tmp.add(sum);
                }
            }
            result.add(tmp);
        }

        return result;
    }
}
