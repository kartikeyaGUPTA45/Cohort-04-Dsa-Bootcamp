// Link: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

Code:

// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n, ans = 0;
        
        while(temp >0) {
            int rem = temp%10;
            ans += (rem*rem*rem);
            temp /= 10;
        }
        
        return (n == ans);
    }
}
