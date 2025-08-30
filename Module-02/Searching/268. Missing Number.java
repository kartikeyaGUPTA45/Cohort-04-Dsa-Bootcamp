
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == mid) {
                low = mid+1;
            } else {
                ans = mid;
                high = mid-1;
            }
        }

        return ans == -1 ? nums.length : ans;
    }
}
