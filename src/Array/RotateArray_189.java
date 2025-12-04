package Array;

import java.util.Arrays;

public class RotateArray_189 {


    public static void main(String[] args) {
        int []num = {1, 2, 3, 4, 5, 6, 7};

        rotate(num,3);
        printArray(num);
    }
    static void printArray(int [] num){
        for(int nums:num){
            System.out.print(nums+ " ");
        }
    }

//    static void rotate(int[] num, int k) {
//        if(k==0){
//            return;
//        }
//        if (num== null || num.length==0){
//            return;
//        }
//        int[] ans = new int[num.length];
//        for (int i = 0; i < num.length; i++) {
//            int newIndex = (i+k)% num.length;
//            ans[newIndex] = num[i];
//        }
//        // assign back to original array
//        for(int i = 0; i < num.length; i++) {
//            num[i] = ans[i];
//        }


    static void rotate(int[] num, int k) {
        int n = num.length;
        for (int i = 0; i <=k; i++) {
            int temp = num[0];
            for (int j = 0; j < n-1; j++) {
                num[j] = num[j+1];
            }
            num[n-1] = temp;
        }
    }
}
