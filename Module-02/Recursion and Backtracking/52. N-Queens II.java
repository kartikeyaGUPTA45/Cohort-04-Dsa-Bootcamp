class Solution {

    public List<String> prepareTheConfig(boolean board[][], int n) {
        List<String> config = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String ans = "";
            for(int j=0;j<n;j++) {
                if (board[i][j] == true) {
                    ans += "Q";
                } else {
                    ans += ".";
                }
            }
            config.add(ans);
        }

        return config;
    }

    public boolean isSafePos(int row, int col, boolean board[][], int n) {
        // for d1 direction
        for(int r = row-1,c = col-1; r >= 0 && c >= 0; r--,c--) {
            if (board[r][c] == true) {
                return false;
            }
        }

        // for d2 direction
        for(int r = row-1;r >= 0; r--) {
            if (board[r][col] == true) {
                return false;
            }
        }

        // for d3 direction
        for(int r = row-1,c = col+1;r >= 0 && c < n; r--,c++) {
            if (board[r][c] == true) {
                return false;
            }
        }

        return true;
    }

    public void helper(int row, boolean board[][], int n, List<List<String>> ans) {
        if (row == n) {
            List<String> subAns = prepareTheConfig(board, n);
            ans.add(new ArrayList<>(subAns));
            return;
        }

        for(int col = 0;col < n; col++) {
            if (isSafePos(row, col, board, n)) {
                board[row][col] = true;
                helper(row+1, board, n, ans);
                board[row][col] = false; // marking false for finding all the solution
            }
        }
    }

    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean board[][] = new boolean[n][n];
        helper(0, board, n, ans);
        return ans.size();
    }
}
