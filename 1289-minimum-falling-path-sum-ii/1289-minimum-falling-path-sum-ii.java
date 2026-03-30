import java.util.Arrays;

class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -200001);
        }

        int min = Integer.MAX_VALUE;

        for (int cc = 0; cc < n; cc++) {
            int ans = rec(grid, 0, cc, dp);
            min = Math.min(min, ans);
        }

        return min;
    }

    private int rec(int[][] matrix, int cr, int cc, int[][] dp) {

        if (cc < 0 || cc >= matrix.length) {
            return Integer.MAX_VALUE;
        }

        if (cr == matrix.length - 1) {
            return matrix[cr][cc];
        }

        if (dp[cr][cc] != -200001) {
            return dp[cr][cc];
        }

        int ans = Integer.MAX_VALUE;

        for (int c = 0; c < matrix.length; c++) {
            if (c == cc) continue;

            int next = rec(matrix, cr + 1, c, dp);
            ans = Math.min(ans, next);
        }

        return dp[cr][cc] = matrix[cr][cc] + ans;
    }
}