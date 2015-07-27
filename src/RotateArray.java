/**
 * Created by WangJQ on 2015/7/14.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return;
        if(nums.length == 1)
            return;

        k = k % nums.length;
        if(k == 0)
            return;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        int tmp;

        while(start < end) {
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    public static void main(String args[]) {
        int[] a = {1, 2};
        rotate(a, 3);
    }
}
