class Solution {

    private int helper(int row, int col, int m, int n, int grid[][]) {
        if (row >= m || col >= n || grid[row][col] == 1) {
            return 0;
        }

        // if (grid[row][col] == 1) {
        //     return 0;
        // }

        if (row == m-1 && col == n-1) {
            return 1;
        }

        int rightPaths = helper(row, col+1, m, n, grid);
        int downPaths = helper(row+1, col, m, n, grid);

        return rightPaths + downPaths;
    }

    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return helper(0,0,m,n,grid);
    }
}
