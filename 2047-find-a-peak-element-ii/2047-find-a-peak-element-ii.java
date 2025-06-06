class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int curr = mat[i][j];

                int top = (i > 0) ? mat[i - 1][j] : -1;
                int bottom = (i < m - 1) ? mat[i + 1][j] : -1;
                int left = (j > 0) ? mat[i][j - 1] : -1;
                int right = (j < n - 1) ? mat[i][j + 1] : -1;

                if (curr > top && curr > bottom && curr > left && curr > right) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1}; 
    }
}