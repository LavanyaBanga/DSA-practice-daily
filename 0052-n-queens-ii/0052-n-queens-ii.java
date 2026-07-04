class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        // initially filled with '.'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                board[i][j] = '.';
        }
        backtrack(board, 0);
        return count;
    }

    private void backtrack(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        // horizontally placed i.e. only 1 queen in a row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                backtrack(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {
        // check upper vertical column
        for (int i = row - 1; i >= 0; i--)
            if (board[i][col] == 'Q')
                return false;

        // check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }
}