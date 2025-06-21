Link: https://www.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1

Code: 

// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int ans = 0, pow = 1;
        
        for(int i=b.length()-1;i>=0;i--) {
            int d = b.charAt(i) - '0';
            ans += (d*pow);
            pow*=2;
        }
        
        return ans;
    }
}
