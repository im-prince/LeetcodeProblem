package Array;

import java.util.*;

public class RotateArray_189 {

    static void rotate(int[] num, int k) {
        if(k==0){
            return;
        }
        if (num== null || num.length==0){
            return;
        }
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int newIndex = (i+k)% num.length;
            ans[newIndex] = num[i];



        }

        // assign back to original array
        for(int i = 0; i < num.length; i++) {
            num[i] = ans[i];

        }

    }
}
