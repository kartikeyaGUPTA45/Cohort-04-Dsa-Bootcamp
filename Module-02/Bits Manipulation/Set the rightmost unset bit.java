// Problem Link: https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1

// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
        return (n|(n+1));
    }
}
