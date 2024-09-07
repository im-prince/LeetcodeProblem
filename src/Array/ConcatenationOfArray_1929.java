package Array;

import java.util.Arrays;
public class ConcatenationOfArray_1929 {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+ nums.length] = ans[i];

        }
        return ans;
    }
}
