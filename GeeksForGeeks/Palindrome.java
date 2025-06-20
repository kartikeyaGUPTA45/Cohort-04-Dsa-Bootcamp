// Link: https://www.geeksforgeeks.org/problems/palindrome0746/1

Code: 
// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int temp = n, ans = 0;
        
        while(temp > 0) {
            int rem = temp%10;
            ans = ans*10 + rem;
            temp /= 10;
        }
        
        return (n == ans);
    }
}
