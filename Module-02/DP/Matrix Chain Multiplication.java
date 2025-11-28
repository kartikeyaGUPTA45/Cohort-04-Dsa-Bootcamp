// Problem: https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1

//Code:

class Solution {
    
    private static int tab_mcm(int arr[], int dp[][], int n) {
        for(int i = n-1;i>=1;i--) {
            for(int j=i+1;j<n;j++) {
                int ans = Integer.MAX_VALUE;
                for(int k=i;k<j;k++) {
                    int subAns = dp[i][k] + dp[k+1][j] + (arr[i-1]*arr[k]*arr[j]);
                    ans = Math.min(ans, subAns);
                }
                
                dp[i][j] = ans;
            }
        }
        
        return dp[1][n-1];
    }
    
    private static int memo_mcm(int arr[], int i, int j, int dp[][]) {
        if (i >= j) {
            return 0;
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++) {
            int subAns = memo_mcm(arr,i,k,dp) + memo_mcm(arr,k+1,j,dp) + (arr[i-1]*arr[k]*arr[j]);
            ans = Math.min(ans, subAns);
        }
        
        return dp[i][j] = ans;
    }
    
    
    private static int rec_mcm(int arr[], int i, int j) {
        if (i >= j) {
            return 0;
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++) {
            int subAns = rec_mcm(arr,i,k) + rec_mcm(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            ans = Math.min(ans, subAns);
        }
        
        return ans;
    }
    
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n][n];
        
        // for(int a[] : dp) {
        //     Arrays.fill(a, -1);
        // }
        
        // return rec_mcm(arr,1,arr.length-1);
        // return memo_mcm(arr,1,n-1,dp);
        return tab_mcm(arr,dp,n);
        
    }
}
