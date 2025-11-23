class Solution {
    public int longestStrChain(String[] words) {
        int n = words.length;

        Arrays.sort(words, (s1,s2) -> Integer.compare(s1.length(), s2.length()));

        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int ans = 1;

        for(int idx = 1; idx < n;idx++) {
            for(int prev = 0;prev<idx;prev++) {
                if (checkPre(words[prev], words[idx])) {
                    dp[idx] = Math.max(dp[idx], dp[prev]+1);
                }
            }
            ans = Math.max(ans, dp[idx]);
        }

        return ans;
    }

    private boolean checkPre(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n >= m || m-n != 1) {
            return false;
        }

        int i=0,j=0;

        while(i < m && j < n) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            i++;
        }

        return (j == n);
    }
}
