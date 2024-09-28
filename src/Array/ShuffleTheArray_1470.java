package Array;

import java.util.Arrays;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i=0, j=n;
        for (int k = 0; k < n*2; k=k+2) {
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            i++;
            j++;
        }
        return ans;
    }

}
