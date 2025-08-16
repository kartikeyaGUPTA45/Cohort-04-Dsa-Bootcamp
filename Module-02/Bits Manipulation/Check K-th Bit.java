//Problem link: https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        return (((n>>k)&1) == 1) ? true : false;
    }
}
