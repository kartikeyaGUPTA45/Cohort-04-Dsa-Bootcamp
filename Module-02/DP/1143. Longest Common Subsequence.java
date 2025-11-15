class Solution {

    private int lcs_spo(String t1, String t2) {
        int m = t1.length();
        int n = t2.length();

        int curr[] = new int [n+1];
        int next[] = new int [n+1];

        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if (t1.charAt(i) == t2.charAt(j)) {
                    curr[j] = next[j+1] + 1;
                } else {
                    curr[j] = Math.max(curr[j+1], next[j]);
                }
            }

            next = curr.clone();
        }

        return curr[0];
    }

    private int lcs_tab(String t1, String t2, int dp[][]) {
        int m = t1.length();
        int n = t2.length();

        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if (t1.charAt(i) == t2.charAt(j)) {
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[0][0];
    }

    private int lcs_memo(int i, int j, String t1, String t2, int dp[][]) {
        if (i == t1.length() || j == t2.length()) {
            return dp[i][j] = 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (t1.charAt(i) == t2.charAt(j)) {
            return dp[i][j] = lcs_memo(i+1, j+1, t1, t2, dp) + 1;
        } else {
            int ans1 = lcs_memo(i+1, j, t1, t2, dp);
            int ans2 = lcs_memo(i, j+1, t1, t2, dp);

            return dp[i][j] = Math.max(ans1, ans2);
        }
    }

    private int lcs_memo2(int i, int j, String t1, String t2, int dp[][]) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (t1.charAt(i) == t2.charAt(j)) {
            return dp[i][j] = lcs_memo2(i-1, j-1, t1, t2, dp) + 1;
        } else {
            int ans1 = lcs_memo2(i-1, j, t1, t2, dp);
            int ans2 = lcs_memo2(i, j-1, t1, t2, dp);

            return dp[i][j] = Math.max(ans1, ans2);
        }
    }

    private int lcs_rec1(int i, int j, String t1, String t2) {

        if (i == t1.length() || j == t2.length()) {
            return 0;
        }

        if (t1.charAt(i) == t2.charAt(j)) {
            return lcs_rec1(i+1, j+1, t1, t2) + 1;
        } else {
            int ans1 = lcs_rec1(i+1, j, t1, t2);
            int ans2 = lcs_rec1(i, j+1, t1, t2);

            return Math.max(ans1, ans2); 
        }
    }

    private int lcs_rec2(int i, int j, String t1, String t2) {

        if (i < 0 || j < 0) {
            return 0;
        }

        if (t1.charAt(i) == t2.charAt(j)) {
            return lcs_rec2(i-1, j-1, t1, t2) + 1;
        } else {
            int ans1 = lcs_rec2(i-1, j, t1, t2);
            int ans2 = lcs_rec2(i, j-1, t1, t2);

            return Math.max(ans1, ans2); 
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        // return lcs_rec2(text1.length()-1,text2.length()-1,text1,text2);

        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m+1][n+1]; // lcs_memo
        // int dp[][] = new int[n][m]; // lcs_memo2

        // for(int a[] : dp) {
        //     Arrays.fill(a, -1);
        // }

        return lcs_spo(text1,text2);
    }
}
