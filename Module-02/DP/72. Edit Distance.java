class Solution {

    private int mD_rec(String w1, String w2, int n, int m) {
        if (n == 0) return m;
        if (m == 0) return n;

        if (w1.charAt(n-1) == w2.charAt(m-1)) {
            return mD_rec(w1, w2, n-1, m-1);
        } else {
            int insert = mD_rec(w1, w2, n, m-1);
            int replace = mD_rec(w1, w2, n-1, m-1);
            int delete = mD_rec(w1, w2, n-1, m);

            return Math.min(insert, Math.min(replace, delete)) + 1;
        }
    }

    private int mD_memo(String w1, String w2, int n, int m, int dp[][]) {
        if (n == 0) return m;
        if (m == 0) return n;

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (w1.charAt(n-1) == w2.charAt(m-1)) {
            return dp[n][m] = mD_memo(w1, w2, n-1, m-1,dp);
        } else {
            int insert = mD_memo(w1, w2, n, m-1, dp);
            int replace = mD_memo(w1, w2, n-1, m-1, dp);
            int delete = mD_memo(w1, w2, n-1, m, dp);

            return dp[n][m] = Math.min(insert, Math.min(replace, delete)) + 1;
        }
    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int [n+1][m+1];
        for(int a[] : dp) {
            Arrays.fill(a, -1);
        }

        return mD_memo(word1, word2, n, m, dp);
    }
}
