package Array;

public class HouseRobber_198 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 8};
        int ans = rob(nums);
        System.out.println(ans);
    }
    static int rob(int[] num) {
        int rob = 0;
        int norob = 0;
        for (int i = 0; i < num.length; i ++) {
            int newRob = norob + num[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}


