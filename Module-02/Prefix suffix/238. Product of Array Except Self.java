class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int[n];

        int pp = 1, sp = 1;

        for(int i=0;i<n;i++) {
            ans[i] = pp;
            pp *= nums[i];
        }

        for(int i=n-1;i>=0;i--) {
            ans[i] *= sp;
            sp *= nums[i];
        }

        return ans;
    }
}
