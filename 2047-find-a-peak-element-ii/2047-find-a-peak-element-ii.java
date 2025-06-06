class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int left = 0, right = n - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

          
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            
            int leftVal = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : -1;
            int rightVal = (midCol + 1 < n) ? mat[maxRow][midCol + 1] : -1;

         
            if (mat[maxRow][midCol] > leftVal && mat[maxRow][midCol] > rightVal) {
                return new int[]{maxRow, midCol};
            } else if (leftVal > mat[maxRow][midCol]) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        return new int[]{-1, -1}; 
    }
}
