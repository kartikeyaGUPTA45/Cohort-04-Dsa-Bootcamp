// Problem Link: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int cnt = 0;
        
        for(int ele : arr) {
            if (ele == target) {
                cnt+=1;
            }
        }
        
        return cnt;
        
    }
}

