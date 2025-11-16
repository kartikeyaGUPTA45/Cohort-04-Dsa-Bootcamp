class Solution {
    public String shortestCommonSupersequence(String t1, String t2) {
        int m = t1.length();
        int n = t2.length();

        int dp[][] = new int[m+1][n+1];

        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if (t1.charAt(i) == t2.charAt(j)) {
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < m && j < n) {
            if (t1.charAt(i) == t2.charAt(j)) {
                ans.append(t1.charAt(i));
                i++;
                j++;
            } else if (dp[i+1][j] >= dp[i][j+1]) {
                ans.append(t1.charAt(i));
                i++;
            } else {
                ans.append(t2.charAt(j));
                j++;
            }
        }

        while(i < m) {
            ans.append(t1.charAt(i));
            i++;
        }

        while(j < n) {
            ans.append(t2.charAt(j));
            j++;
        }


        return ans.toString();
    }
}
