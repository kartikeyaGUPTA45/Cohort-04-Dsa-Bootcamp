
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n*m-1;

        while(low <= high) {
            int mid = (low + high)/2;
            int row = mid/m;
            int col = mid%m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return false;
    }
}
