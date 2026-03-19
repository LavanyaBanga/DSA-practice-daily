class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRow(board) && checkCol(board) && checkGrid(board);
    }

    private boolean checkRow(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!seen.add(val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean checkCol(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char val = board[j][i];
                if (val != '.') {
                    if (!seen.add(val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean checkGrid(char[][] board) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!checkThree(board, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkThree(char[][] board, int row, int col) {
        Set<Character> seen = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!seen.add(val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}