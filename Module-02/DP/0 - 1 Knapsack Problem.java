// Problem Link: https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

//Code: 


class Solution {
    
    private int knapsack_rec(int W, int val[], int wt[], int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        
        if (wt[n-1] <= W) {
            int subAns1 = knapsack_rec(W-wt[n-1], val, wt, n-1) + val[n-1];
            int subAns2 = knapsack_rec(W, val, wt, n-1);
            
            return Math.max(subAns1, subAns2);
        } else {
            return knapsack_rec(W, val, wt, n-1);
        }
    }
    
    private int knapsack_memo(int W, int val[], int wt[], int n, int dp[][]) {
        if (n == 0 || W == 0) {
            return 0;
        }
        
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        
        if (wt[n-1] <= W) {
            int subAns1 = knapsack_memo(W-wt[n-1], val, wt, n-1, dp) + val[n-1];
            int subAns2 = knapsack_memo(W, val, wt, n-1, dp);
            
            return dp[n][W] = Math.max(subAns1, subAns2);
        } else {
            return dp[n][W] = knapsack_memo(W, val, wt, n-1, dp);
        }
    }
    
    private int knapsack_tab(int W, int val[], int wt[], int n, int dp[][]) {
        for(int i=1; i<= n;i++) {
            for(int w=0;w<=W;w++) {
                if (wt[i-1] <= w) {
                    dp[i][w] = Math.max(dp[i-1][w-wt[i-1]] + val[i-1] , dp[i-1][w]);
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        
        return dp[n][W];
    }
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int dp[][] = new int [n+1][W+1];
        
        // for(int a[] : dp) {
        //     Arrays.fill(a, -1);
        // }
        
        // return knapsack_rec(W, val, wt, n);
        // return knapsack_memo(W, val, wt, n, dp);
        return knapsack_tab(W, val, wt, n, dp);
    }
}
