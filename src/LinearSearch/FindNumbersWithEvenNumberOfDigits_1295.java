package LinearSearch;

public class FindNumbersWithEvenNumberOfDigits_1295 {
    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,-87,7,-9876};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        int count = 0;
        for (int num : nums) {
            if (numberOfDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    static int numberOfDigits(int num){
        if (num <0){
            num = num*-1;
        }
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
