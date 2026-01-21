class Triple {
    int row;
    int col; 
    int time;

    public Triple(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Triple> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;

        int freshOranges = 0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (grid[i][j] == 1) {
                    freshOranges+=1;
                } else if (grid[i][j] == 2) {
                    q.add(new Triple(i,j,0));
                }
            }
        }

        int ans = 0;

        int dr [] = {-1,0,0,1};
        int dc [] = {0,-1,1,0};

        while(q.size() > 0) {
            Triple t = q.remove();
            int row = t.row;
            int col = t.col;
            int time = t.time;

            ans = Math.max(ans, time);

            for(int i=0;i<4;i++) {
                int nrow = row + dr[i];
                int ncol = col + dc[i];


                if (nrow >= 0  && nrow <m && ncol >= 0 && ncol < n && grid[nrow][ncol] == 1) {
                    q.add(new Triple(nrow, ncol, time+1));
                    grid[nrow][ncol] = 2;
                    freshOranges-=1;
                }
            }
        }

        return (freshOranges == 0) ? ans : -1;
    }
}
