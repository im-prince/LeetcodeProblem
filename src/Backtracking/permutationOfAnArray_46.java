package Backtracking;

import java.util.ArrayList;
import java.util.List;
public class permutationOfAnArray_46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);

    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        permutations(ans,nums,0,nums.length);
        return ans;

    }

    static  void permutations(List<List<Integer>> ans, int[] nums, int l,int r){
        if(l == r){
            printArray(nums);
            return;
        }
        for (int i = l; i <r ; i++) {
            swap(nums,i,l);
            permutations(ans,nums,l+1,r);
            swap(nums,i,l);

        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] =nums[i];
        nums[i] = temp;
    }

    public static void printArray(int[] a) {
        for(int e: a) {
            System.out.print(e);
        }
        System.out.println();
    }
}
