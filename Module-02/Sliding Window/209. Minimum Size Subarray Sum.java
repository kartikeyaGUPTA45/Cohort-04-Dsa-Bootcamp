class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, sum = 0, ans = Integer.MAX_VALUE;
        boolean flag = false;

        while(i < nums.length) {
            sum += nums[i];

            while(sum >= target) {
                flag = true;
                ans = Math.min(ans, i-j+1);
                sum -= nums[j];
                j++;
            }
            i++;
        }

        if (flag == false) return 0;
        return ans;
    }
}
