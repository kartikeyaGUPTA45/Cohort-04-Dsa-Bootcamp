// Problem link: https://www.geeksforgeeks.org/problems/bit-manipulation-1666686020/1#


// User function Template for Java

class Solution {
    static void bitManipulation(int N, int i) {
        // code here
        i = i-1;
        int getBit = ((N>>i)&1);
        int setBit = ((1<<i)|N);
        int clearBit = (~(1<<i)&N);
        
        System.out.print(getBit + " " + setBit + " " + clearBit);
    }
}

