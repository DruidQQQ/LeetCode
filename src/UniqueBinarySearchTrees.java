/**
 * Created by WangJQ on 2015/7/10.
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        int[] record = new int[n + 1];
        record[0] = 0;
        record[1] = 1;
        record[2] = 2;

        for(int i = 3; i <= n; i++) {
            int temp = 0;
            for(int j = 0; j < i; j++) {
                temp += record[j] * record[i - j - 1];
            }
            record[i] = temp;
        }

        return record[n];
    }
}
