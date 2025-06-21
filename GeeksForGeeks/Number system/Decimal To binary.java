// Link: https://www.geeksforgeeks.org/problems/decimal-to-binary-1587115620/1

Code-01: 

class Solution {
    static String decToBinary(int n) {
        // code here
        String ans = "";
        
        while(n > 0) {
            int rem = n%2;
            ans = (rem+"") + ans;
            n/=2;
        }
        
        return ans;
        
    }
}

Code-02: 

class Solution {
    
    public static String reverseString(String str) {
        String ans = "";
        for(int i=str.length()-1;i>=0;i--) {
            ans+=str.charAt(i);
        }
        
        return ans;
    }
    
    static String decToBinary(int n) {
        // code here
        String ans = "";
        
        while(n > 0) {
            int rem = n%2;
            ans += (rem+"");
            n/=2;
        }
        
        return reverseString(ans);
        
    }
}


