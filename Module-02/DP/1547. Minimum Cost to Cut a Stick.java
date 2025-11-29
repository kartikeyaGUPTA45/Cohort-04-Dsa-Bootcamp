class Solution {

    private int mc_rec(int n, int si, int ei, int m, int cuts[]) {
        if (si >= ei) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int idx = si;idx<ei;idx++) {
            int ls = (si == 0) ? 0 : cuts[si-1];
            int re = (ei == m) ? n : cuts[ei];
            int cost = re - ls;
            int subAns = mc_rec(n,si,idx,m,cuts) + mc_rec(n,idx+1,ei,m,cuts) + cost;
            ans = Math.min(ans, subAns);
        }

        return ans;
    }

    private int mc_memo(int n, int si, int ei, int m, int cuts[], int dp[][]) {
        if (si >= ei) {
            return 0;
        }

        if (dp[si][ei] != -1) {
            return dp[si][ei];
        }

        int ans = Integer.MAX_VALUE;
        for(int idx = si;idx<ei;idx++) {
            int ls = (si == 0) ? 0 : cuts[si-1];
            int re = (ei == m) ? n : cuts[ei];
            int cost = re - ls;
            int subAns = mc_memo(n,si,idx,m,cuts,dp) + mc_memo(n,idx+1,ei,m,cuts,dp) + cost;
            ans = Math.min(ans, subAns);
        }

        return dp[si][ei] = ans;
    }

    private int mc_tab(int n, int m, int cuts[], int dp[][]) {
        for(int si = m-1;si>=0;si--) {
            for(int ei = si+1;ei<=m;ei++) {
                int ans = Integer.MAX_VALUE;
                for(int idx = si;idx<ei;idx++) {
                    int ls = (si == 0) ? 0 : cuts[si-1];
                    int re = (ei == m) ? n : cuts[ei];
                    int cost = re - ls;
                    int subAns = dp[si][idx] + dp[idx+1][ei] + cost;
                    ans = Math.min(ans, subAns);
                }

                dp[si][ei] = ans;
            }
        }

        return dp[0][m];
    }

    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        Arrays.sort(cuts);
        int dp[][] = new int[m+1][m+1];
        // for(int a[]: dp) {
        //     Arrays.fill(a, -1);
        // }

        // return mc_rec(n,0,m,m,cuts);
        // return mc_memo(n,0,m,m,cuts,dp);
        return mc_tab(n,m,cuts,dp);
    }
}
