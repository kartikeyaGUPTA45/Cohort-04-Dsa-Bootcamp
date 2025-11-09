class Solution {

    private int minSqr_rec(int n) {
        if (n == 0) {
            return 0;
        }

        int minAns = Integer.MAX_VALUE;
        for(int i = 1;i*i<=n;i++) {
            int subAns = minSqr_rec(n-i*i)+1;
            minAns = Math.min(minAns, subAns);
        }

        return minAns;
    }

    private int minSqr_memo(int n, int dp[]) {
        if (n == 0) {
            return 0;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int minAns = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++) {
            int subAns = minSqr_memo(n-i*i, dp) + 1;
            minAns = Math.min(subAns, minAns);
        }

        dp[n] = minAns;
        return dp[n];

    }

    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return minSqr_memo(n, dp);
    }
}

