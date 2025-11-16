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

        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();

        while(i < m && j < n) {
            if (t1.charAt(i) == t2.charAt(j)) {
                ans.append(t1.charAt(i));
                i++;
                j++;
            } else if (dp[i+1][j] >= dp[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(ans.toString());

        return dp[0][0];
    }
