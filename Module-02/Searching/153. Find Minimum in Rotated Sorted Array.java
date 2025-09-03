
class Solution {

    public boolean isMinVal(int nums[], int mid, int n) {
        int leftVal = (mid == 0) ? Integer.MAX_VALUE : nums[mid-1];
        int rightVal = (mid == n-1) ? Integer.MAX_VALUE : nums[mid+1];
        int val = nums[mid];

        return (leftVal > val && rightVal > val);
    }

    public boolean isMaxVal(int nums[], int mid, int n) {
        int leftVal = (mid == 0) ? Integer.MIN_VALUE : nums[mid-1];
        int rightVal = (mid == n-1) ? Integer.MIN_VALUE : nums[mid+1];
        int val = nums[mid];

        return (leftVal < val && rightVal < val);
    }

    public int findMin(int[] nums) {
        int n = nums.length;

        if (nums[0] < nums[n-1]) {
            return nums[0];
        }

        int low = 0;
        int high = n-1;

        while(low <= high) {
            int mid = (low + high)/2;

            if (isMinVal(nums, mid, n)) {
                return nums[mid];
            } else if (isMaxVal(nums, mid, n)) {
                return nums[mid+1];
            } else if (nums[low] < nums[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return -1;
    }
}
