package Array;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies_1431 {
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extracandies = 3;
        System.out.println(kidsWithCandies(candies,extracandies));
    }


    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        //calculating the highest value in the array
        for(int i = 0 ; i <  candies.length; i ++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0 ; i < candies.length; i ++){
            //checking if the sum greater or eqaul to max
            if(candies[i] + extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
