// Problem: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int maxSum = 0;
        
        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        
        maxSum = sum;
        
        int i =k,j=0;
        int n = arr.length;
        
        while(i < n) {
            sum += arr[i];
            sum -= arr[j];
            
            if (maxSum < sum) {
                maxSum = sum;
            }
            i++;
            j++;
        }
        
        return maxSum;
        
    }
}
