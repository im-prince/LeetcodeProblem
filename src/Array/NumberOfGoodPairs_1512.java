package Array;

public class NumberOfGoodPairs_1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] num) {
        int count =0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]){
                    count ++;
                }
            }
        }
        return count;
    }
}
