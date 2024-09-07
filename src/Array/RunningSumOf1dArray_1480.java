package Array;

import java.util.Arrays;
public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,3};
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
            nums[i + 1] = nums[i] + nums[i+1];

        }
        return nums;
    }
}
