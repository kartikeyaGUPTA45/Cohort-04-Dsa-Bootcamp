class Solution {

    private int up_tab(int m, int n, int dp[][]) {
        dp[m-1][n-1] = 1;

        for(int row=m-1;row>=0;row--) {
            for(int col=n-1;col>=0;col--) {
                if (row == m-1 && col == n-1) {
                    continue;
                }

                int rightPaths = 0;
                int downPaths = 0;

                if (col+1 < n) rightPaths = dp[row][col+1];
                if (row+1 < m) downPaths = dp[row+1][col];

                dp[row][col] = rightPaths + downPaths;
            }
        }

        return dp[0][0];
    }

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

        return up_tab(m, n, dp);
    }
}
