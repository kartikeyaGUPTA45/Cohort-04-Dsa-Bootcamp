class Solution {

    private int fib_spo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0, b = 1;

        for(int i=2;i<=n;i++) {
            int c = a+b;
            a = b;
            b = c;
        }

        return b;
    }

    private int fib_tab(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    private int fib_memo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fib_memo(n-1, dp) + fib_memo(n-2, dp);
        return dp[n];
    }

    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        return fib_spo(n);
    }
}
