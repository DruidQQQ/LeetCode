/**
 * Created by WangJQ on 2015/7/10.
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int i, j;
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];

        for(i = 0; i < row; i++) {
            if(matrix[i][0] == '1') {
                dp[i][0] = 1;
                max = 1;
            }
        }

        for(j = 0; j < col; j++) {
            if(matrix[0][j] == '1') {
                dp[0][j] = 1;
                max = 1;
            }
        }

        for(i = 1; i < row; i++) {
            for(j = 1; j < col; j++) {
                if(matrix[i][j] == '0')
                    dp[i][j] = 0;
                else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max * max;
    }
}
