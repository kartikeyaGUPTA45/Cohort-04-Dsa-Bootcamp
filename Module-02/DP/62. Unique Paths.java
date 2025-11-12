class Solution {

    private int up_memo(int row, int col, int m, int n, int dp[][]) {
        if (row >= m || col >= n) {
            return 0;
        }

        if (row == m-1 && col == n-1) {
            return 1;
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int rightPaths = up_memo(row, col+1, m, n, dp);
        int downPaths = up_memo(row+1, col, m, n, dp);

        dp[row][col] = rightPaths + downPaths;
        return dp[row][col];
    }

    private int up_rec(int row, int col, int m, int n) {
        if (row >= m || col >= n) {
            return 0;
        }

        if (row == m-1 && col == n-1) {
            return 1;
        }

        int rightPaths = up_rec(row, col+1, m, n);
        int downPaths = up_rec(row+1, col, m, n);

        return rightPaths + downPaths;
    }

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];

        for(int [] x : dp) {
            Arrays.fill(x, -1);
        }

        return up_memo(0, 0, m, n, dp);
    }
}
