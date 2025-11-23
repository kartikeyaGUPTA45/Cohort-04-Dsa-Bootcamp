class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        int dp[] = new int[n];

        Arrays.sort(pairs, (a,b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        Arrays.fill(dp, 1);
        int ans = 1;

        for(int idx = 1; idx < n;idx++) {
            for(int prev = 0;prev<idx;prev++) {
                if (pairs[idx][0] > pairs[prev][1]) {
                    dp[idx] = Math.max(dp[idx], dp[prev]+1);
                }
            }
            ans = Math.max(ans, dp[idx]);
        }

        return ans;
    }
}
