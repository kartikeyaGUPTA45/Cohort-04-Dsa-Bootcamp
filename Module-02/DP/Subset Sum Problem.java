// Problem Link: https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

//Code: 

class Solution {
    
    // 1 -> true, 0 -> false, -1 -> invalid value
    
    private static boolean memo(int arr[], int sum, int idx, int ssf, int dp[][], int n) {
        if (ssf > sum) {
            return false;
        }
        
        if (idx == n) {
            return (sum == ssf);
        }
        
        if (dp[idx][ssf] != -1) {
            return (dp[idx][ssf] == 1) ? true : false;
        }
        
        boolean take = memo(arr, sum, idx+1, ssf + arr[idx], dp, n);
        boolean notTake = memo(arr, sum, idx+1, ssf, dp, n);
        
        dp[idx][ssf] = (take || notTake) ? 1 : 0;
        
        return (take || notTake);
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];
        
        for(int a[] : dp) {
            Arrays.fill(a, -1);
        }
        
        return memo(arr,sum,0,0,dp,n);
        
    }
}
