class Solution {
    
    public int firstOcc(int nums[], int x) {
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == x) {
                ans = mid;
                high = mid-1;
            } else if (nums[mid] > x) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    public int lastOcc(int nums[], int x) {
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == x) {
                ans = mid;
                low = mid+1;
            } else if (nums[mid] > x) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;

    }
    
    int countFreq(int[] arr, int target) {
        // code here
        
        int ans1 = lastOcc(arr, target);
        if (ans1 == -1) {
            return 0;
        }
        
        int ans2 = firstOcc(arr, target);
        
        return ans1 - ans2 + 1;
        
    }
}
