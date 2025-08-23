//Problem Link: https://www.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1#


class Solution {
    
    public static int closestPowerOf2LessThanN(int n) {
        int x = 0;
        while((1<<x) <= n) {
            x+=1;
        }
        return x-1;
    }
    
    public static int countSetBits(int n) {
        // code here
        if (n == 0) {
            return 0;
        }
        
        int x = closestPowerOf2LessThanN(n);
        int csbLessThan2PowerX = x*(1<<(x-1));
        int csbMsb = n-(1<<x)+1;
        int remaingPart = countSetBits(n-(1<<x));
        
        return csbLessThan2PowerX + csbMsb + remaingPart;
    }
}
