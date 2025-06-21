Link: https://www.geeksforgeeks.org/problems/decimal-to-any-base-conversion2440/1

Code-01: 

// User function Template for Java
class Solution {
    
    public static String getAlphabet(int rem) {
        if (rem == 10) return "A";
        else if (rem == 11) return "B";
        else if (rem == 12) return "C";
        else if (rem == 13) return "D";
        else if (rem == 14) return "E";
        return "F";
    }
    
    static String getNumber(int b, int n) {
        // code here
        String ans = "";
        
        while(n > 0) {
            int rem = n%b;
            if (rem <=9) ans = (rem+"") + ans;
            else ans = getAlphabet(rem) + ans;
            n/=b;
        }
        
        return ans;
        
    }
}


Code-02: 

// User function Template for Java
class Solution {
    
    public static char getAlphabet(int rem) {
        return (char)((rem-10)+'A'); // Imp
    }
    
    static String getNumber(int b, int n) {
        // code here
        String ans = "";
        
        while(n > 0) {
            int rem = n%b;
            if (rem <=9) ans = (rem+"") + ans;
            else ans = getAlphabet(rem) + ans;
            n/=b;
        }
        
        return ans;
        
    }
}








