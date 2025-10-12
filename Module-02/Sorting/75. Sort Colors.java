class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;

        while(i <= k) {
            if (nums[i] == 0) {
                swap(nums,i,j);
                i++;
                j++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums,i,k);
                k--;
            }
        }

    }

    public void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
