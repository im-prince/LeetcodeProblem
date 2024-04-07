package Array;

public class ShuffleTheArray_1470 {


    public int[] shuffle(int[] num, int n) {
        int[] ans = new int[2*n];
        int i=0, j=n;
        for (int k = 0; k < n*2; k=k+2) {
            ans[k] = num[i];
            ans[k+1] = num[j];
            i++;
            j++;
        }
        return ans;
    }

}
