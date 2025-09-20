class Solution {

    private int helper(int row, int col, int m, int n, int cnt, int grid[][]) {
        if (row < 0 || row >= m || col < 0 || col >=n || grid[row][col] == -1) {
            return 0;
        }

        if (grid[row][col] == 2) {
            if (cnt == 0) {
                return 1;
            }
            return 0;
        }

        int ans = 0;
        grid[row][col] = -1; // marking the cell as visited

        int dirs[][] = {{0,-1}, {0,1}, {-1,0}, {1,0}};

        for(int d[] : dirs) {
            ans += helper(row + d[0], col + d[1], m, n, cnt-1, grid);
        }

        grid[row][col] = 0; // unmarking the cell
        return ans; // returning the answer
    }

    public int uniquePathsIII(int[][] grid) {
        int st_row = 0;
        int st_col = 0;
        int cnt = 1; // Taking becoz we need to include the starting cell
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (grid[i][j] == 1) {
                    st_row = i;
                    st_col = j;
                } else if (grid[i][j] == 0) {
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);

        return helper(st_row, st_col, m, n, cnt, grid);
        
    }
}
