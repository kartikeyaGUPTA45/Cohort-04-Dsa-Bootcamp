class Pair {
    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<Pair> q = new LinkedList<>();
        int m = isWater.length;
        int n = isWater[0].length;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (isWater[i][j] == 1) {
                    isWater[i][j] = 0;
                    q.add(new Pair(i,j));
                } else {
                    isWater[i][j] = -1;
                }
            }
        }

        int dr [] = {-1,0,0,1};
        int dc [] = {0,-1,1,0};

        while(q.size() > 0) {
            Pair p = q.remove();

            int row = p.row;
            int col = p.col;

            for(int i=0;i<4;i++) {
                int nrow = row + dr[i];
                int ncol = col + dc[i];

                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && isWater[nrow][ncol] == -1) {
                    isWater[nrow][ncol] = isWater[row][col] + 1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }

        return isWater;
    }
}
