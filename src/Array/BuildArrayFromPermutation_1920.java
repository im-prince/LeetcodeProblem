package Array;

// https://leetcode.com/problems/build-array-from-permutation/

public class BuildArrayFromPermutation_1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < ans.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
