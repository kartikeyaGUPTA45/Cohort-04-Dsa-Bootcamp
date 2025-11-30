//Problem Link: https://www.geeksforgeeks.org/problems/boolean-parenthesization5610/1

// Code: 

// User function Template for Java
class Solution {
    
    private static int cw_rec(String s, int i, int j, int isTrue) {
        if (i > j) {
            return 0;
        }
        
        if (i == j) {
            if (s.charAt(i) == 'T' && isTrue == 1) return 1;
            if (s.charAt(i) == 'F' && isTrue == 0) return 1;
            return 0;
        }
        
        int ways = 0;
        
        for(int k=i+1; k<j;k++) {
            char op = s.charAt(k);
            
            int c1T = cw_rec(s,i,k-1,1);
            int c1F = cw_rec(s,i,k-1,0);
            int c2T = cw_rec(s,k+1,j,1);
            int c2F = cw_rec(s,k+1,j,0);
            
            if (op == '&') {
                if (isTrue == 1) { 
                    ways += (c1T * c2T);
                } else {
                    ways += ((c1T * c2F) + (c1F * c2T) + (c1F * c2F));
                }
            } else if (op == '|') {
                if (isTrue == 1) {
                    ways += ((c1T * c2F) + (c1F * c2T) + (c1T * c2T));
                } else {
                    ways += (c1F * c2F);
                }
                
            } else {
                if (isTrue == 1) {
                    ways += ((c1T*c2F) + (c1F*c2T));
                } else {
                    ways += ((c1F * c2F) + (c1T * c2T));
                }
            }
        }
        
        return ways;
    }
    
    private static int cw_memo(String s, int i, int j, int isTrue, int dp[][][]) {
        if (i > j) {
            return 0;
        }
        
        if (i == j) {
            if (s.charAt(i) == 'T' && isTrue == 1) return 1;
            if (s.charAt(i) == 'F' && isTrue == 0) return 1;
            return 0;
        }
        
        if (dp[i][j][isTrue] != -1) {
            return dp[i][j][isTrue];
        }
        
        int ways = 0;
        
        for(int k=i+1; k<j;k++) {
            char op = s.charAt(k);
            
            int c1T = cw_memo(s,i,k-1,1,dp);
            int c1F = cw_memo(s,i,k-1,0,dp);
            int c2T = cw_memo(s,k+1,j,1,dp);
            int c2F = cw_memo(s,k+1,j,0,dp);
            
            if (op == '&') {
                if (isTrue == 1) { 
                    ways += (c1T * c2T);
                } else {
                    ways += ((c1T * c2F) + (c1F * c2T) + (c1F * c2F));
                }
            } else if (op == '|') {
                if (isTrue == 1) {
                    ways += ((c1T * c2F) + (c1F * c2T) + (c1T * c2T));
                } else {
                    ways += (c1F * c2F);
                }
                
            } else {
                if (isTrue == 1) {
                    ways += ((c1T*c2F) + (c1F*c2T));
                } else {
                    ways += ((c1F * c2F) + (c1T * c2T));
                }
            }
        }
        
        return dp[i][j][isTrue] = ways;
    }
    
    static int countWays(String s) {
        // code here
        int n = s.length();
        int dp[][][] = new int[n][n][2];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }
        // return cw_rec(s,0,n-1,1);
        return cw_memo(s,0,n-1,1,dp);
    }
}
