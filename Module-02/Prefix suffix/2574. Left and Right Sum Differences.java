class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int lsa[] = new int[n];
        int rsa[] = new int[n];

        for(int i=1;i<n;i++) {
            lsa[i] = lsa[i-1] + nums[i-1];
        }

        for(int i=n-2;i>=0;i--) {
            rsa[i] = rsa[i+1] + nums[i+1];
        }

        int ans[] = new int[n];
        for(int i=0;i<n;i++) {
            ans[i] = Math.abs(lsa[i] - rsa[i]);
        }

        return ans;
    }
}
