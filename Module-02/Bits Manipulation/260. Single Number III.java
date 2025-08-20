class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for(int ele:nums) {
            x ^= ele;
        }

        int setBit = (x&(-x)); // Get the rightmost set bit

        int ans [] = new int[2]; // ans[0] -> 0, ans[1] -> 1
        for(int i=0;i<nums.length;i++) {
            if ((nums[i]&setBit) != 0) {
                ans[1] ^= nums[i];
            } else {
                ans[0] ^= nums[i];
            }
        }

        return ans;
    }
}
