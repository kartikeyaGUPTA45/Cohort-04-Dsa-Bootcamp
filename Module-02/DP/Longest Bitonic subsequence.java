// Problem Link: https://www.geeksforgeeks.org/problems/longest-bitonic-subsequence0824/1

Code:
class Solution {
    
    
    public static int[] lis_algo(int nums[], int n) {
        int dp[] = new int[n];
        
        Arrays.fill(dp, 1);
        
        for(int idx=1;idx<n;idx++) {
            for(int prev = 0;prev<idx;prev++) {
                if (nums[idx] > nums[prev]) {
                    dp[idx] = Math.max(dp[idx], dp[prev]+1);
                }
            }
        }
        
        return dp;
    }
    
    
    public static int[] reverse_lis_algo(int nums[], int n) {
        int dp[] = new int[n];
        
        Arrays.fill(dp, 1);
        
        for(int idx=n-2;idx>=0;idx--) {
            for(int prev = idx+1;prev<n;prev++) {
                if (nums[idx] > nums[prev]) {
                    dp[idx] = Math.max(dp[idx], dp[prev]+1);
                }
            }
        }
        
        return dp;
    }
    
    public static int longestBitonicSequence(int n, int[] nums) {
        // code here
        int dp1[] = lis_algo(nums, n);
        int dp2[] = reverse_lis_algo(nums, n);
        
        int ans = 0;
        
        for(int i=0;i<n;i++) {
            if (dp1[i] > 1 && dp2[i] > 1) {
                int sum = dp1[i] + dp2[i] - 1;
                ans = Math.max(ans, sum);
            }
        }
        
        return ans;
        
    }
}
