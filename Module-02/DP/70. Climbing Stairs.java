class Solution {

    private int cs_rec(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return cs_rec(n-1) + cs_rec(n-2);
    }

    private int cs_memo(int n, int dp[]) {
        if (n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = cs_memo(n-1, dp) + cs_memo(n-2, dp);
        return dp[n];
    }

    private int cs_tab(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    private int cs_spo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int a = 1;
        int b = 1;

        for(int i=2;i<=n;i++) {
            int c = a+b;
            a=b;
            b=c;
        }

        return b;
    }

    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        return cs_spo(n);
    }
}
