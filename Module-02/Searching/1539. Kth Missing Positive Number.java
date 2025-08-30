
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = (low + high)/2;
            int missingNbr = arr[mid]-mid-1;
            
            if (missingNbr < k) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return low + k;
    }
}
