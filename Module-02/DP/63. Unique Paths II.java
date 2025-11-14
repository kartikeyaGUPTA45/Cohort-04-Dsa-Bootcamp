class Solution {

    private int up_memo(int row, int col, int m, int n, int grid[][], int dp[][]) {
        if (row >= m || col >= n || grid[row][col] == 1) {
            return 0;
        }

        if (row == m-1 && col == n-1) {
            return 1;
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int rightPaths = up_memo(row, col+1, m, n, grid, dp);
        int downPaths = up_memo(row+1, col, m, n, grid, dp);

        return dp[row][col] = rightPaths + downPaths;
    }

    private int up_rec(int row, int col, int m, int n, int grid[][]) {
        if (row >= m || col >= n || grid[row][col] == 1) {
            return 0;
        }

        if (row == m-1 && col == n-1) {
            return 1;
        }

        int rightPaths = up_rec(row, col+1, m, n, grid);
        int downPaths = up_rec(row+1, col, m, n, grid);

        return rightPaths + downPaths;
    }


    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int [m][n];

        for(int a[]: dp) {
            Arrays.fill(a, -1);
        }


        return up_memo(0,0,m,n,grid,dp);
    }
}
