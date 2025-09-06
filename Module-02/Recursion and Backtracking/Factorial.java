// Problem Link: https://www.geeksforgeeks.org/problems/factorial5739/1
// 1 way
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


// 2 way

class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        
        if (n == 0) {
            return 1;
        }
        
        return factorial(n-1)*n;
    }
}

