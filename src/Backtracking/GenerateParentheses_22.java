package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

  static   public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<String>();
        backtracking(ans,"",0,0,3);
        return ans;

    }
    static void backtracking(List<String> ans, String curr,int open, int close,int n ) {
        if(curr.length() == 2*n){
            ans.add(curr);
            return;
        }
        if(open < n){
            backtracking(ans,curr+'(',open+1,close,n);
        }
        if (close < open){
            backtracking(ans,curr+')',open,close+1,n);

        }

    }


}
