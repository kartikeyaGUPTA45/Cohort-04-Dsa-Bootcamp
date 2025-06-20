// Link: https://www.geeksforgeeks.org/problems/count-digits-1606889545/1?page=2&category=Java,Functions&sortBy=submissions

Code: 
class Solution {
    public int countDigits(int n) {
        // code here
        int ans = 0;
        while(n > 0) {
            ans+=1;
            n/=10;
        }
        
        return ans;
    }
}



