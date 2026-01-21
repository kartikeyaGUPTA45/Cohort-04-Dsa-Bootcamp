class Triple {
    int row;
    int col; 
    int dis;

    public Triple(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int vis[][] = new int[m][n];
        Queue<Triple> q = new LinkedList<>();

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (mat[i][j] == 0) {
                    q.add(new Triple(i,j,0));
                    vis[i][j] = 1;
                }
            }
        }

        int distance[][] = new int[m][n];
        int dr [] = {-1,0,0,1};
        int dc [] = {0,-1,1,0};

        while(q.size() > 0) {
            Triple t = q.remove();
            int row = t.row;
            int col = t.col;
            int dis = t.dis;


            for(int i=0;i<4;i++) {
                int nrow = row + dr[i];
                int ncol = col + dc[i];

                distance[row][col] = dis;

                if (nrow >= 0  && nrow <m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0) {
                    q.add(new Triple(nrow, ncol, dis+1));
                    vis[nrow][ncol] = 1;
                }
            }
        }

        return distance;
        
    }
}
