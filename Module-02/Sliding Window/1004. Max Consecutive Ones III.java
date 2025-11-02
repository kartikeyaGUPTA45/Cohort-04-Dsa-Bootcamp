class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0,j = 0, ans = 0, zeros = 0;

        while(i < nums.length) {
            if (nums[i] == 0) {
                zeros+=1;
            }

            while(zeros > k) {
                if (nums[j] == 0) {
                    zeros-=1;
                }
                j++;
            }

            ans = Math.max(ans, i-j+1);
            i+=1;
        }
        return ans;

    }
}
