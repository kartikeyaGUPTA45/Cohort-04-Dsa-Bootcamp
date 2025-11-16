Problem Link: https://www.geeksforgeeks.org/problems/print-all-lcs-sequences3413/1

Code: 
class Solution {
    public List<String> allLCS(String t1, String t2) {
        // Code here
        
        int m = t1.length();
        int n = t2.length();

        int dp[][] = new int [m+1][n+1];
        
        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if (t1.charAt(i) == t2.charAt(j)) {
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashSet<String> set = allLCS_rec(0,0,t1, t2, dp, map);
        
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
    
    private HashSet<String> allLCS_rec(int i, int j, String t1, String t2, int dp[][], HashMap<String, HashSet<String>> map) {
        
        HashSet<String> subAns = new HashSet<>();
        if (i == t1.length() || j == t2.length()) {
            subAns.add("");
            return subAns;
        }
        
        String key = i + "%" + j;
        
        if (map.containsKey(key)) {
            return map.get(key);
        }
        
        
        if (t1.charAt(i) == t2.charAt(j)) {
            HashSet<String> rans = allLCS_rec(i+1, j+1, t1, t2, dp, map);
            for(String str : rans) {
                String s = t1.charAt(i) + str;
                subAns.add(s);
            }
        } else {
            if (dp[i+1][j] > dp[i][j+1]) {
                HashSet<String> rans = allLCS_rec(i+1, j, t1, t2, dp, map);
                subAns.addAll(rans);
            } else if (dp[i+1][j] < dp[i][j+1]) {
                HashSet<String> rans = allLCS_rec(i, j+1, t1, t2, dp, map);
                subAns.addAll(rans);
            } else {
                HashSet<String> rans1 = allLCS_rec(i+1, j, t1, t2, dp, map);
                HashSet<String> rans2 = allLCS_rec(i, j+1, t1, t2, dp, map);
                subAns.addAll(rans1);
                subAns.addAll(rans2);
            }
        }
        
        map.put(key, subAns);
        return subAns;
    }
}
