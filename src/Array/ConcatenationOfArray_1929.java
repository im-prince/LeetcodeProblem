package Array;

import java.util.Arrays;
public class ConcatenationOfArray_1929 {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    static int[] getConcatenation(int[] num) {
        int[] ans = new int[2*num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[i];
            ans[i + num.length ] = num[i];

        }
        return ans;

    }
}
