class Solution {

    private int lis_rec(int nums[], int idx, int prev) {
        if (idx == nums.length) {
            return 0;
        }

        int ans = 0;
        if (prev == -1 || nums[idx] > nums[prev]) {
            int take = lis_rec(nums, idx+1, idx) + 1;
            ans = Math.max(ans, take);
        }

        int notTake = lis_rec(nums, idx+1, prev);
        ans = Math.max(ans, notTake);

        return ans;
    }

    private int lis_memo(int nums[], int idx, int prev, int dp[][]) {
        if (idx == nums.length) {
            return 0;
        }

        if (prev != -1 && dp[idx][prev] != -1) {
            return dp[idx][prev];
        }


        int ans = 0;
        if (prev == -1 || nums[idx] > nums[prev]) {
            int take = lis_memo(nums, idx+1, idx, dp) + 1;
            ans = Math.max(ans, take);
        }

        int notTake = lis_memo(nums, idx+1, prev, dp);
        ans = Math.max(ans, notTake);

        return (prev != -1) ?  dp[idx][prev] = ans : ans;
    }

   // mapping of prev index => -1 -> 0, 0 -> 1, 1 -> 2
    private int lis_memo2(int nums[], int idx, int prev, int dp[][]) {
        if (idx == nums.length) {
            return 0;
        }

        if (dp[idx][prev+1] != -1) {
            return dp[idx][prev+1];
        }

        int ans = 0;
        if (prev == -1 || nums[idx] > nums[prev]) {
            int take = lis_memo2(nums, idx+1, idx, dp) + 1;
            ans = Math.max(ans, take);
        }

        int notTake = lis_memo2(nums, idx+1, prev, dp);
        ans = Math.max(ans, notTake);

        return dp[idx][prev+1] = ans;
    }

    private int lis_tab(int nums[]) {
        int n = nums.length;
        int dp[][] = new int[n+1][n+1];

        for(int idx = n-1;idx>=0;idx--) {
            for(int prev = idx-1;prev>=-1;prev--) {
                int take = 0;
                if (prev == -1 || nums[idx] > nums[prev]) {
                    take = dp[idx+1][idx+1] + 1;
                }

                int notTake = dp[idx+1][prev+1];
                dp[idx][prev+1] = Math.max(take, notTake);
            }
        }

        return dp[0][0];

    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        // int dp[][] = new int[n+1][n+1]; // lis_memo
        int dp[][] = new int[n+1][n+1]; // lis_memo2
        for(int a[]: dp) {
            Arrays.fill(a, -1);
        }

        // return lis_rec(nums, 0, -1);
        // return lis_memo2(nums, 0, -1, dp);
        return lis_tab(nums);
    }
}
