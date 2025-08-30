
class Solution {

    public int bs(int grid[][], int row, int low, int high) {
        int idx = -1;

        while(low <= high) {
            int mid = (low + high)/2;
            if (grid[row][mid] >= 0) {
                low = mid+1;
            } else {
                idx = mid;
                high = mid-1;
            }
        }

        return idx;
    }

    public int countNegatives(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int row = 0;row<n;row++) {
            int idx = bs(grid, row, 0, m-1);
            if (idx != -1) {
                ans += (m-idx);
            }
        }

        return ans;
    }
}
