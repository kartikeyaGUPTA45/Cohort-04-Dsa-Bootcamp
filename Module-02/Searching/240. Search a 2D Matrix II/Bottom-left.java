class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = m-1;
        int col = 0;

        while(row >= 0 && col < n) {
            int val = matrix[row][col];

            if (val == target) {
                return true;
            } else if (val > target) {
                row -= 1;
            } else {
                col += 1;
            }
        }

        return false;
    }
}
