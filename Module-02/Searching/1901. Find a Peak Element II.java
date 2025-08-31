class Solution {

    public int findMaxInACol(int arr[][], int col, int n) {
        int maxVal = Integer.MIN_VALUE;
        int idx = -1;

        for(int i=0;i<n;i++) {
            if (arr[i][col] > maxVal) {
                maxVal = arr[i][col];
                idx = i;
            }
        }

        return idx;
    }

    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int ans[] = new int[2];
        Arrays.fill(ans, -1);

        int low = 0;
        int high = m-1;

        while(low <= high) {
            int mid = (low + high)/2;

            int idx = findMaxInACol(arr, mid, n);
            int leftVal = (mid > 0) ? arr[idx][mid-1] : Integer.MIN_VALUE;
            int rightVal = (mid < m-1)? arr[idx][mid+1] : Integer.MIN_VALUE;
            int val = arr[idx][mid];
            if (val > leftVal && val > rightVal) {
                ans[0] = idx;
                ans[1] = mid;
                return ans;
            } else if (val < leftVal) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }
}
