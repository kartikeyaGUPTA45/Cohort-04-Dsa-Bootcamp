// Link: https://www.geeksforgeeks.org/problems/sum-of-n-number--144226/1?page=6&category=Java,Functions&sortBy=submissions

Code: 
class Solution {
    public int sumOfFirstN(int n) {
        // code here
        int ans = 0;
        for(int i=1;i<=n;i++) {
            ans += i;
        }
        
        return ans;
    }
}


