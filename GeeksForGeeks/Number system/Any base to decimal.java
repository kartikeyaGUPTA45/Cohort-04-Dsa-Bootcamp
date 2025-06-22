Link: https://www.geeksforgeeks.org/problems/convert-from-any-base-to-decimal3736/1

Code: 
// User function Template for Java

class Solution {
    public static int getDigit(char ch) {
        if (ch >= 'A') return ch-'A'+10;
        return ch-'0';
    }
    
    static int decimalEquivalent(String n, int b) {
        // code here
        int ans = 0;
        int pow = 1;
        
        for(int i = n.length()-1;i>=0;i--) {
            char ch = n.charAt(i);
            int d = getDigit(ch);
            if (d >= b) return -1;
            
            ans += (d*pow);
            pow*=b;
        }
        
        return ans;
    }
}
