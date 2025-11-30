class Solution {

    private int bb_rec(int arr[], int i,int j, int n) {
        if (i > j) return 0;

        int ans = Integer.MIN_VALUE;

        for(int k=i;k<=j;k++) {
            int subAns = bb_rec(arr,i,k-1,n) + bb_rec(arr,k+1,j,n) + (arr[i-1] * arr[k] * arr[j+1]);
            ans = Math.max(ans, subAns);
        }

        return ans;
    }

    private int bb_memo(int arr[], int i,int j, int n, int dp[][]) {
        if (i > j) return 0;

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MIN_VALUE;

        for(int k=i;k<=j;k++) {
            int subAns = bb_memo(arr,i,k-1,n,dp) + bb_memo(arr,k+1,j,n,dp) + (arr[i-1] * arr[k] * arr[j+1]);
            ans = Math.max(ans, subAns);
        }

        return dp[i][j] = ans;
    }

    private int bb_tab(int arr[], int n, int dp[][]) {
        for(int i=n;i>0;i--) {
            for(int j=i;j<=n;j++) {
                int ans = Integer.MIN_VALUE;
                for(int k=i;k<=j;k++) {
                    int subAns = dp[i][k-1] + dp[k+1][j] + (arr[i-1] * arr[k] * arr[j+1]);
                    ans = Math.max(ans, subAns);
                }
                dp[i][j] = ans;
            }
        }

        return dp[1][n];
    }

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int arr[] = new int [n+2];
        arr[0] = 1;
        arr[n+1] = 1;

        for(int i=0;i<n;i++) {
            arr[i+1] = nums[i];
        }

        int dp[][] = new int[n+2][n+2];

        // for(int a[] : dp) {
        //     Arrays.fill(a, -1);
        // }

        // return bb_rec(arr,1,n,n);
        // return bb_memo(arr,1,n,n,dp);
        return bb_tab(arr,n,dp);
    }
}
