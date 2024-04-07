package Array;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2,7,};
        int[] an = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(an));
    }
    static int[] smallerNumbersThanCurrent(int[] num) {
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int k : num) {
                if (num[i] > k) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
