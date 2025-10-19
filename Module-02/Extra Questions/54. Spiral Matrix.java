class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int rmin = 0, rmax = n-1;
        int cmin = 0, cmax = m-1;

        List<Integer> ans = new ArrayList<>();
        int count = n*m;

        while(count > 0) {
            for(int col = cmin;col<=cmax && count > 0;col++) {
                ans.add(matrix[rmin][col]);
                count--;
            }
            rmin++;

            for(int row = rmin;row <= rmax && count > 0;row++) {
                ans.add(matrix[row][cmax]);
                count--;
            }
            cmax--;

            for(int col = cmax;col>=cmin && count > 0;col--) {
                ans.add(matrix[rmax][col]);
                count--;
            }
            rmax--;

            for(int row = rmax;row>=rmin && count > 0;row--) {
                ans.add(matrix[row][cmin]);
                count--;
            }
            cmin++;
        }

        return ans;
    }
}
