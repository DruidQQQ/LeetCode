/**
 * Created by WangJQ on 2015/7/27.
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int size = Integer.SIZE;

        for(int i = 0; i < size / 2; i++) {
            int j = size - 1 - i;

            int low = (n >> i) & 1;
            int high = (n >> j) & 1;

            int A = 1 << i;
            int B = 1 << j;

            if((high ^ low) == 1) {
                n = n ^ (A | B);
            }
        }

        return n;
    }
}
