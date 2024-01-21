package org.example.top150interviews;
import java.util.Arrays;

public class MinFallingPathSum {
//    Minimum Falling Path Sum
//
//    Given an n x n array of integers matrix,
//    return the minimum sum of any falling path through matrix.
//
//    A falling path starts at any element in the first row and
//    chooses the element in the next row that is either directly
//    below or diagonally left/right. Specifically, the next element
//    from position (row, col) will be (row + 1, col - 1), (row + 1, col),
//    or (row + 1, col + 1).

    public static int minFallingPathSum(int[][] matrix) {
        //take rows(m) and colums(n)
        int m = matrix.length;
        int n = matrix[0].length;

        //create a matrix which will save the temporary minimum sum
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        //give the first matrix row to the dp matrix
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        //here, starting from 2nd row we sum every value
        // of the row with the values from the last row
        // and the last, the current and the next.
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int minPrev = Integer.MAX_VALUE;
                if ( j - 1 >= 0) {
                    minPrev = Math.min(minPrev, dp[i-1][j-1]);
                }
                minPrev = Math.min(minPrev, dp[i-1][j]);

                if ( j + 1 < n){
                    minPrev = Math.min(minPrev, dp[i-1][j+1]);
                }
                //we give to the dp matrix the elements of the initial matrix, plus the results
                dp[i][j] = matrix[i][j] + minPrev;
            }
        }

        //we return a stream with the minimum value when we are at the last row.
        return Arrays.stream(dp[m-1]).min().getAsInt();
    }

    public static void main(String[] args) {
        int[][] matrix =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int minFallingSum = minFallingPathSum(matrix);
        System.out.println("Minimum path falling sum is: " + minFallingSum);
    }
}
