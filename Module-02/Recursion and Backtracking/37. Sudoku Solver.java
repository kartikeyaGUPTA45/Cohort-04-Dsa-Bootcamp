class Solution {

    private boolean isSafe(char board[][], int row, int col, char val) {
        for(int i=0;i<9;i++) {
            // row 
            if(board[row][i] != '.' && board[row][i] == val) return false;

            // col
            if (board[i][col] != '.' && board[i][col] == val) return false;

            // 3*3 matrix
            int r = 3*(row/3) + i/3;
            int c = 3*(col/3) + i%3;

            if (board[r][c] != '.' && board[r][c] == val) return false;
        }

        return true;
    }

    private boolean helper(char[][] board) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if (board[i][j] == '.') {
                    for(char ch = '1' ; ch <= '9'; ch++) {
                        if (isSafe(board, i, j, ch)) {
                            board[i][j] = ch;
                            if (helper(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
 
    public void solveSudoku(char[][] board) {
        helper(board);
    }
}
