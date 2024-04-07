package Array;

public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] matt = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int ans = diagonalSum(matt);
        System.out.println(ans);
    }

    static int diagonalSum(int[][] mat) {

        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]+mat[i][n-i-1];
        }
        if(mat.length%2 != 0){
            sum-=mat[n/2][n/2]; // if matrix is odd the middle number added two times,so we deduct the middle number
        }
        return sum;

    }

}
