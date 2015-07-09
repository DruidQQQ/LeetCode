import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by WangJQ on 2015/7/9.
 */
public class MergeIntervals {
    class Interval {
        int start;
        int end;
        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0)
            return intervals;

        int num = intervals.size();

        Interval[] intervalArray = intervals.toArray(new Interval[num]);
        Arrays.sort(intervalArray, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        List<Interval> result = new ArrayList<Interval>();
        Interval mover = intervalArray[0];
        for(int i = 1; i < intervalArray.length; i++) {
            if(mover.end < intervalArray[i].start) {
                result.add(mover);
                mover = intervalArray[i];
            }
            else
                mover.end = Math.max(mover.end, intervalArray[i].end);
        }
        result.add(mover);

        return result;
    }
}
