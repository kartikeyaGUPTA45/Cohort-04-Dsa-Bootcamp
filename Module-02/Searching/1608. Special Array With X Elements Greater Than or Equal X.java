
class Solution {

    public int countGORE(int nums[], int ele) {
        int x = 0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] >= ele) {
                x+=1;
            }
        }

        return x;
    }

    public int specialArray(int[] nums) {
        int low = 0;
        int high = 1000;

        while(low <= high) {
            int mid = (low + high)/2;

            int x = countGORE(nums, mid);

            if (mid == x) {
                return mid;
            } else if (mid > x) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return -1;
    }
}
