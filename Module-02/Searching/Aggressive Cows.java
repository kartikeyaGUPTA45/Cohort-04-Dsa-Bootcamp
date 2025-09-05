// Problem Link: https://www.geeksforgeeks.org/problems/aggressive-cows/1


class Solution {
    
    public boolean isAbleToPlace(int stalls[], int mid, int n, int k) {
        int cnt = 1;
        int lastCowPos = stalls[0];
        
        for(int i=1;i<n;i++) {
            if (stalls[i] - lastCowPos >= mid) {
                cnt+=1;
                lastCowPos = stalls[i];
            }
        }
        
        return (cnt >= k);
    }
    
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        
        while(low <= high) {
            int mid = (low + high)/2;
            
            if (isAbleToPlace(stalls, mid, n, k)) {
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        
        return ans;
    }
}
