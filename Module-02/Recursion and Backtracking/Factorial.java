// Problem Link: https://www.geeksforgeeks.org/problems/factorial5739/1

class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        
        if (n == 0) {
            return 1;
        }
        
        int subAns = factorial(n-1);
        int ans = subAns * n;
        
        return ans;
    }
}


