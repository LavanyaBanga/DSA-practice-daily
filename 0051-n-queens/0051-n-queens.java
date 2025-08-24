class Solution {
    /// to check queen is safe or not
    private boolean isSafePlace(int n, char[][] nQueens, int row, int col) {
        // to check column
        for (int i = 0; i < n; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }
        }
        // to get check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
  /// for upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        // no conflict found
        return true;
    }
//   
    private void solveNQueens(int n, List<List<String>> output, char[][] nQueens, int row) {
        // base case for recursion
        if (row == n) {
        // arraylist to store the result
            List<String> solution = new ArrayList<>();
            // character array -whole dashboard
            for (char[] rowArray : nQueens) {
                // roArray m string bnake add kr rhe h
                solution.add(new String(rowArray));
            }
            // to add soln in output
            output.add(solution);
            return;
        }
        // column ka loop
        for (int col = 0; col < n; col++) {
            // safe function check
            
            if (isSafePlace(n, nQueens, row, col)) {
// temporary placing a queen at a place

                nQueens[row][col] = 'Q';
                // recursive call to place in next row
                solveNQueens(n, output, nQueens, row + 1);
                // backtracking if no queen
                nQueens[row][col] = '.';
            }
        }
    }

   // list for putting another row with a queen
    public List<List<String>> solveNQueens(int n) {
        // arraylist to store queen
        List<List<String>> output = new ArrayList<>();
        // 2d array fr chessboard
        char[][] nQueens = new char[n][n];  
        // initially filling rows with .
        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }
        
        solveNQueens(n, output, nQueens, 0);
        return output;
    }
}